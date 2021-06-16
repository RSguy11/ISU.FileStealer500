package ISUAttempt2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Part7 extends PanelBase{

	JPanel panel;
	JLabel label1;
	// State / data variables
	int xPos = 0;
	int yPos = 0;
	int[][] Maze;
	JLabel AvatarLabel;
	
	int xOffSet = 1;
	int yOffSet = 1;
	int xStretch = 100;
	int yStretch = 66;
				
	void PopulateMaze() {
		boolean posFound = false;
		// 0 floor, can move
		// 1 is wall can't move
		// 2 is end, exit
		// 3 is start position
		Maze = new int[][]{
			{0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,1,1,0,1},
			{1,0,1,0,0,0,0,0,1},
			{1,0,1,1,1,1,1,3,1},
			{1,0,1,0,0,0,0,1,0},
			{0,0,0,0,0,1,0,1,1},
			{0,1,0,0,1,0,0,0,1},
			{0,1,1,1,1,0,1,0,1},
			{0,0,0,0,1,0,2,1,1},
		};
			
		// Set init coords from start position in maze
		for (int xTest=0;xTest<Maze[0].length;xTest++) {
			for (int yTest=0; yTest<Maze.length; yTest++) {
				if (Maze[yTest][xTest] == 3) {				
					xPos = xTest;
					yPos = yTest;
					posFound = true;}
				
				if (posFound) {
					break;}				
			}
			if (posFound) {
				break;}
		}
		System.out.println("xPos:" + xPos + " yPos:" + yPos );
	}
	
	void Move(int x, int y) {
		System.out.println("Moving");
		System.out.println("Start xPos:" + xPos + " yPos:" + yPos );
		boolean userWon = false;
		boolean validMove = false;
		int xTest = xPos + x;
		int yTest = yPos + y;
		int squareTest = 0;
		
		
		System.out.println("x:" + x + " xTest:" + xTest +" y:" + y +" yTest:" + yTest);		
		// 0 floor, can move
		// 1 is wall can't move
		// 2 is end, exit
		// 3 is start position
		if ((xTest >= 0 && xTest < Maze[0].length) && (yTest >= 0 && yTest < Maze.length)){
			squareTest = Maze[yTest][xTest];
			if (squareTest != 1 ) {
				validMove = true;
				
				if (squareTest == 2 ) {
					userWon = true;
				}
			}				
		}
		
		System.out.println("squareTest:" + squareTest + " validMove:" + validMove +" userWon:" + userWon);	
		
		if (validMove) {
			xPos = xTest;
			yPos = yTest;
			UIMoveAvatar();
		}
		
		
		if (userWon) {
			UserWon();
			
		}
		
		System.out.println("Final xPos:" + xPos + " yPos:" + yPos );
	}
	
	void UIRenderMaze(JPanel panel)
	{		
		int xLBound;
		int yLBound;		
		
		int square = 0;
		JLabel Label1;
		
		for (int xTest=0;xTest<Maze[0].length;xTest++) {
			for (int yTest=0; yTest<Maze.length; yTest++) {
				
				square = Maze[yTest][xTest];
				xLBound = xOffSet+(xTest*xStretch);
				yLBound = yOffSet+(yTest*yStretch);				
				
				if (square == 1) {
					label1 = new JLabel();
					label1.setText("1");
					label1.setOpaque(true);
					label1.setBackground(Color.BLACK);
					label1.setForeground(Color.BLACK);
					label1.setBounds(xLBound, yLBound, xStretch, yStretch);		
					label1.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
				}
				else if (square == 2) {
					label1 = new JLabel();
					label1.setText("2");
					label1.setOpaque(true);
					label1.setBackground(Color.GREEN);
					label1.setForeground(Color.WHITE);
					label1.setBounds(xLBound, yLBound, xStretch, yStretch);	
					label1.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
				}
				else if (square == 3) {
					label1 = new JLabel();
					label1.setText("Your Files");
					label1.setOpaque(true);
					label1.setForeground(Color.WHITE);
					label1.setBackground(Color.BLUE);
					label1.setBounds(xLBound, yLBound, xStretch, yStretch);			
					label1.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
					
					AvatarLabel = label1;
				}
				
				panel.add(label1);					
			}			
		}		
	}
	
	void UIMoveAvatar() {
		System.out.println("MoveAvatar");
		int xLBound = xOffSet+(xPos*xStretch);
		int yLBound = yOffSet+(yPos*yStretch);	
		
		AvatarLabel.setBounds(xLBound, yLBound, xStretch, yStretch);	
	}
	
	void InvalidKeyAction() {
		System.out.println("InvalidKeyAction");
	}
	
	void Quit() {
		System.out.println("Quit");
	}
	
	void UserWon() {
		System.out.println("UserWon");
		CleanUp();
		
	}
	
	@Override
	void Start(JFrame CurrentFrame) {
		// TODO Auto-generated method stub
		System.out.println("Panel 4");
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1000, 700);
		panel.setVisible(true);
		panel.setBackground(Color.WHITE);
		
		label1 = new JLabel();
		label1.setText("");
		label1.setForeground(Color.WHITE);
		label1.setBounds(350, 250, 900, 100);
		label1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		panel.add(label1);		
		
		PopulateMaze();
		
		UIRenderMaze(panel);
		
		
		CurrentFrame.getContentPane().add(panel);
		panel.repaint();
		MainClass.frame1.addKeyListener(new KeyListener() {
		
		
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				int keyCode = arg0.getKeyCode();
				
				
				// Main game loop
				// Is valid key
				// If no text for user say "use arrows or Q"
				// if valid, which?
				// try move test in maze array ie x-1 what is value of array if 0, good, if 1 no action, if 2 jump to end condition
				// prevent moving outside of array bounds
				// method (x, y) does action
				
				
				// x is first, and horizontal
				// y is second, and vertical
				switch(keyCode) {
				case KeyEvent.VK_UP:
					System.out.println("Up");
					Move(0,-1);
					break;
				case KeyEvent.VK_DOWN:
					System.out.println("down");
					Move(0,1);
					break;
				case KeyEvent.VK_LEFT:
					System.out.println("left");
					Move(-1,0);
					break;
				case KeyEvent.VK_RIGHT:
					System.out.println("right");
					Move(1,0);
					break;
				case KeyEvent.VK_Q:
					System.out.println("Q Pressed");
					Quit();
					break;	
				default:
					System.out.println("Invalid Key");			
						
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			

		});
		
	}
	
	void CleanUp() {
		panel.setVisible(false);
		MainClass.NextPanel();
	}

}


