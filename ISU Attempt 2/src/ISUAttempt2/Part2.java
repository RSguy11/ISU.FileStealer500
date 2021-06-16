package ISUAttempt2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Part2 extends PanelBase {
	JPanel panel;
	JLabel label1;
	JButton Button1;
	JButton Button2;
	JButton Button3;
	JButton Button4; 
	JTextField Textbox1;
	int ClickState=1;
	
	@Override
	void Start(JFrame CurrentFrame) {
		// TODO Auto-generated method stub
		System.out.println("Panel 2");
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1000, 700);
		panel.setVisible(true);
		panel.setBackground(new Color (51-204-255));
	
			
		label1 = new JLabel();
		label1.setText("To Start Were Gonna have to break my FireWall, to get your stuff back");
		label1.setForeground(Color.BLACK);
		label1.setBounds(150, 200, 900, 100);
		label1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		

		Button1 = new JButton();
		Button1.setText("Lets Do it");
		Button1.setBounds(350, 325, 300, 30);
		Button1.addActionListener(changeLabel1);
		
		Button2 = new JButton();
		Button2.addActionListener(changeLabel1);
		
		Button3 = new JButton();
		Button3.addActionListener(changeLabel1);
		
		Button4 = new JButton();;
		Button4.addActionListener(changeLabel1);
		
		Textbox1 = new JTextField(30);
		Textbox1.addActionListener(changeLabel1);
		
		panel.add(label1);
		panel.add(Button1);
		CurrentFrame.getContentPane().add(panel);
		panel.repaint();		
		
	}
	
	void CleanUp() {
		panel.setVisible(false);
		MainClass.NextPanel();
	}
	
	AbstractAction changeLabel1 = new AbstractAction () {
		@Override
		    public void actionPerformed(ActionEvent e) {

			if (ClickState== 1) {
				System.out.println("Part 2: Action1 Preformed");
				//debug check
				label1.setLocation(325, 250);
				label1.setText("So how do you plane on doing this ?");
				Button1.setText("Idk Fire extinguisher");
				ClickState++;
			} else if(ClickState== 2) {
				System.out.println("Part 2: Action2 Preformed");
				//debug check
				label1.setText("Funny but no that wont work kiddo");
				Button1.setText("Then What ??");
				ClickState++;
			} else if (ClickState==3  ) {
				System.out.println("Part 2: Action3 Preformed");
				//debug check
				label1.setText("To break My FireWall you Will have to Awnser 3 Basic Questions");
				label1.setLocation(150, 250);
				Button1.setText("Alright Letss-a-go(Mario Voice Intensifies)");
				ClickState++;
			} else if (ClickState== 4 ) {
				System.out.println("Part 2: Action4 Preformed");
				//debug check
				panel.add(Button2);
				panel.add(Button3);
				panel.add(Button4);
				label1.setText("What is your Favuorite Colour");
				label1.setLocation(355, 250);
				Button1.setText("Blue");
				Button2.setText("Pink");
				Button3.setText("Red");
				Button4.setText("Other");
				Button1.setBounds(350, 325, 150, 35);
				Button2.setBounds(550, 325, 150, 35);
				Button3.setBounds(350, 400,	150, 35);
				Button4.setBounds(550, 400, 150, 35);
				ClickState++;
			} else if (ClickState== 5) {
				System.out.println("Part 2: Action5 Preformed");
				//debug check
				label1.setText("HMM Wierd Choose but to eaches own I guess wheel give you that one");
				label1.setLocation(125, 250);
				Button1.setText("Next Question already");
				Button1.setBounds(350, 325, 300, 30);
				Button2.setVisible(false);
				Button3.setVisible(false);
				Button4.setVisible(false);
				ClickState++;
			} else if (ClickState== 6) {
				System.out.println("Part 2: Action6 Preformed");
				//debug check
				label1.setText("What Song Contains the Lyrics (ALMOST HEAVEN WEST VERGINIA)");
				label1.setLocation(150, 250);
				Button1.setText("Country Roads!!");
				Button2.setText("Ranbow Unicorns!");
				Button3.setText("UGGGHHH");
				Button4.setText("Brother Bear!!");
				Button1.setBounds(350, 325, 150, 35);
				Button2.setVisible(true);
				Button3.setVisible(true);
				Button4.setVisible(true);
				ClickState++;
			} else if (ClickState== 7) {
				System.out.println("Part 2: Action7 Preformed");
				//debug check
				label1.setText("I am uncultered Computer and dont know if thats true or not so i'll give it to you");
				label1.setLocation(100, 250);
				Button1.setText("Dumb Computer, just hit me wiht the next one");
				Button1.setBounds(350, 325, 300, 30);
				Button2.setVisible(false);
				Button3.setVisible(false);
				Button4.setVisible(false);
				ClickState++;
			}else if(ClickState== 8 ) {
				System.out.println("Part 2: Action7 Preformed");
				//debug check
				label1.setText("What is the name of your best Friend ???");
				label1.setLocation(300, 250);
				Button1.setText("Leigh");
				Button2.setText("Goran");
				Button3.setText("Flint");
				Button4.setText("Mr.Christian");
				Button1.setBounds(350, 325, 150, 35);
				Button2.setVisible(true);
				Button3.setVisible(true);
				Button4.setVisible(true);
				ClickState++;
			} else if (ClickState== 9) {
				System.out.println("Part 2: Action8 Preformed");
				//debug check
				label1.setText("Ha Jokes on you I Know you have no friends !! you lost");
				label1.setLocation(225, 250);
				Button1.setText("wow..harshman");
				Button1.setBounds(350, 325, 300, 30);
				Button2.setVisible(false);
				Button3.setVisible(false);
				Button4.setVisible(false);
				ClickState++;	
			} else if (ClickState== 10) {
				System.out.println("Part 2: Action9 Preformed");
				//debug check
				label1.setText("Fine, Ill give you one More Chance With a new set of Questions");
				label1.setLocation(225, 250);
				Button1.setText("Alright I will Crush Themmm");
				ClickState++;
			} else if (ClickState== 11) {
				System.out.println("Part 2: Action10 Preformed");
				//debug check
				label1.setText("What is your Favuorite Animal??");
				label1.setLocation(350, 250);
				Button1.setText("Lion");
				Button2.setText("Fox");
				Button3.setText("Sheep");
				Button4.setText("Platapus");
				Button1.setBounds(350, 325, 150, 35);
				Button2.setVisible(true);
				Button3.setVisible(true);
				Button4.setVisible(true);
				ClickState++;
			} else if (ClickState== 12) {
				System.out.println("Part 2: Action11 Preformed");
				//debug check
				label1.setText("Okay, Okay I repect that ");
				label1.setLocation(350, 250);
				Button1.setText("K I know the next questrion gonna be easy to get to the hard ones");
				Button1.setBounds(250, 325, 500, 30);
				Button2.setVisible(false);
				Button3.setVisible(false);
				Button4.setVisible(false);
				ClickState++;
			} else if (ClickState== 13) {
				System.out.println("Part 2: Action12 Preformed");
				//debug check
				label1.setText("What is the meaning of Life");
				label1.setLocation(375, 250);
				Button1.setText("Whatt??");
				Button2.setText("Computer Science");
				Button3.setText("42");
				Button4.setText("Platapus's plural");
				Button1.setBounds(350, 325, 150, 35);
				Button2.setVisible(true);
				Button3.setVisible(true);
				Button4.setVisible(true);
				ClickState++;
			} else if (ClickState== 14) {
				System.out.println("Part 2: Action13 Preformed");
				//debug check
				label1.setText("WRONG ");
				label1.setLocation(500, 250);
				Button1.setText("how was I supposed to know that");
				Button1.setBounds(350, 325, 400, 30);
				Button2.setVisible(false);
				Button3.setVisible(false);
				Button4.setVisible(false);
				ClickState++;
			} else if (ClickState== 15) {
				System.out.println("Part 2: Action14 Preformed");
				//debug check
				label1.setText("Oh Shoot Forgot Human dont Know easy stuff like that, you stupid humans ");
				label1.setLocation(175, 250);
				Button1.setText("WATCH IT! 2.0");
				Button1.setBounds(350, 325, 400, 30);
				ClickState++;
			} else if( ClickState== 16) {
				System.out.println("Part 2: Action15 Preformed");
				//debug check
				label1.setText("Fine One final Question to test you");
				label1.setLocation(350, 250);
				Button1.setText("okay why do I here boss music");
				Button1.setBounds(350, 325, 400, 30);
				ClickState++;
			} else if ( ClickState== 17) {
				System.out.println("Part 2: Action16 Preformed");
				//debug check
				label1.setText("What is my name ");
				label1.setLocation(450, 250);
				Button1.setText("uhhhhhh");
				Button2.setText("uhhhhhh 2.0");
				Button3.setText("uhhhhhh 3.0");
				Button4.setText("perry the Platapus");
				Button1.setBounds(350, 325, 150, 35);
				Button2.setVisible(true);
				Button3.setVisible(true);
				Button4.setVisible(true);
				ClickState++;
			} else if (ClickState== 18) {
				System.out.println("Part 2: Action17 Preformed");
				//debug check
				label1.setText("WOW, and here I though we were becoming friends");
				Button2.setVisible(false);
				Button3.setVisible(false);
				Button4.setVisible(false);
				label1.setLocation(300, 250);
				Button1.setText("I'm Sorry ??");
				Button1.setBounds(350, 325, 400, 30);
				ClickState++;
			} else if (ClickState== 19) {
				System.out.println("Part 2: Action18 Preformed");
				//debug check
				label1.setText("Well, Now the Fires In My heart grow Dim.I feel my once joyus soul darken and fade away");
				label1.setBounds(25, 250, 1000, 100);
				Button1.setText("Well Thats a little dramatic ??");
				Button1.setBounds(250, 325, 300, 30);
				Button2.setVisible(true);
				Button2.setBounds(550, 325, 300, 30);
				Button2.setText("Oh, No My Pour Computer");
				ClickState++;
			} else if (ClickState== 20) {
				System.out.println("Part 2: Action19 Preformed");
				//debug check
				label1.setText("I'm Just Kidding you have passed the first trial, now on to the next 332, its gonna be so fun :)");
				Button1.setText("...Yay?..");
				Button2.setText("....Screw Off :)...");
				ClickState++;
			}else if (ClickState== 21 ) {
				System.out.println("Part 2: Action20 Preformed");
				ClickState =1;
				//debug check
				CleanUp();
			}
			
			}
		};


	
	
	
	
}
