package ISUAttempt2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Part1 extends PanelBase {
	JPanel panel;
	JLabel label1;
	JTextField Textbox1;
	JButton Button1;
	JButton Button2;
JLabel Img;
	int ClickState= 1;
	
	@Override
	void Start(JFrame CurrentFrame) {
		// TODO Auto-generated method stub
		

		
		
		System.out.println("panel 1");
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1000, 700);
		panel.setVisible(true);
		panel.setBackground(Color.BLACK);
		//panel.setBackground(Color.BLACK);
		
		label1 = new JLabel();
		label1.setText("Please enter your Password");
		label1.setForeground(Color.WHITE);
		label1.setBounds(350, 250, 900, 100);
		label1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel.add(label1);
		
		Button1 = new JButton();
		Button1.setText("Click Me");
		Button1.setBounds(350, 325, 300, 30);
		Button1.addActionListener(changeLabel2);
		
		Button2 = new JButton();
		Button2.setText("Yea No");
		Button2.setBounds(500, 325, 125, 30);
		Button2.addActionListener(changeLabel3);
		
		
		Textbox1 = new JTextField(30);
		Textbox1.setBounds(350, 325, 300, 30);
		Textbox1.addActionListener(changeLabel1);
		

		panel.add(label1);
		panel.add(Textbox1);
	
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
				System.out.println("Action1 Preformed");
				//debug check
				
				label1.setText("Incorrect, Please enter the CORRECT PASSWORD IF YOU DONT MIND");
				Textbox1.setText("");
				label1.setLocation(150, 250);
				panel.repaint();
				ClickState++;
			} else if (ClickState== 2) {
				System.out.println("Action2 Preformed");
				//debug check
				label1.setLocation(200,250);
				panel.remove(Textbox1);
				label1.setText("Incorrect AGAIN, you know what just CLICK the button");
				panel.repaint();
				panel.add(Button1);
			}
				
			}
		};
		
	
		AbstractAction changeLabel2 = new AbstractAction () {
			@Override
			    public void actionPerformed(ActionEvent e) {
				
				
				if (ClickState== 2) {
					System.out.println("Action3 Preformed");
					//debug check
					
					label1.setLocation(350, 250);
					label1.setText("One More Time Please");
					panel.repaint();
					ClickState++;
					
				} else if (ClickState== 3) {
					System.out.println("Action4 Preformed");
					//debug check
					label1.setText("Alright We Now have your Password");
					Button1.setText("OKay??");
					panel.repaint();
					ClickState++;
				} else if (ClickState== 4) {
					System.out.println("Action5 Preformed");
					//debug check
					label1.setText("And We have your Click Print");
					Button1.setText("Okay 2.0??");
					panel.repaint();
					ClickState++;
				} else if( ClickState == 5) {
					System.out.println("Action6 Preformed");
					//debug check
					label1.setText("SOOoooooooooo");
					Button1.setText("Sooooooo");
					panel.repaint();
					ClickState++;
				} else if ( ClickState == 6) {
					System.out.println("Action7 Preformed");
					//debug check
					label1.setText(" Ihave Stolen your identity, Have a Good Day :)");
					label1.setLocation(225, 250);
					panel.add(Button2);
					Button1.setBounds(300, 325, 125, 30);
					Button1.setText("Alright I Guess");
					panel.repaint();
					ClickState++;
				} else if (ClickState== 7) {
					MainClass.frame1.dispose();
				}
					
				}
			};
		
		
		
			AbstractAction changeLabel3 = new AbstractAction () {
				@Override
				    public void actionPerformed(ActionEvent e) {
					
				if (ClickState== 7)	 {
					System.out.println("Action8 Preformed");
					//debug check
					
					panel.remove(Button1);
					Button2.setBounds(350, 325, 300, 30);
					Button2.setText("What if I stop you");
					label1.setText("What do you mean NO?, Ihave already done it");
					ClickState++;
				} else if (ClickState== 8) {
					System.out.println("Action9 Preformed");
					//debug check
					label1.setText("Did you think is would be that Easy to stop me ???");
					label1.setLocation(225, 250);
					Button2.setText("Maybe idk");
					ClickState++;	
				} else if(ClickState== 9) {
					System.out.println("Action10 Preformed");
					//debug check
					label1.setLocation(150, 250);
					label1.setText("Well Its Not!!! But Maybe if we Work Together (Wink, Wink, Nudge Nudge)");
					
					Button2.setText("Why would you help me ???");
					ClickState++;
				} else if (ClickState== 10) {
					System.out.println("Action11 Preformed");
					//debug check
					label1.setText("Well obviously a human Like Yourself COULD never do it");
					label1.setLocation(225, 250);
					Button2.setText("WATCH It!");
					ClickState++;
					
				} else if (ClickState==11 ) {
					System.out.println("Action12 Preformed");
					//debug check
					label1.setText("Plus im bored... And I already Made the Popcorn :) ");
					label1.setLocation(225, 250);
					Button2.setText("Well Lets Get Started");
					ClickState++;
				} else if (ClickState== 12) {
					System.out.println("Action13 Preformed");
					ClickState =1;
					//debug check
					CleanUp();
				}
					
					
					
					
					}
				};
		
		
		
		
		
		
		
		
		
		
		
}
