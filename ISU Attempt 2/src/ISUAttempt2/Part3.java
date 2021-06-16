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

public class Part3 extends PanelBase{
	JPanel panel;
	JLabel label1;
	JTextField Textbox1;
	JButton Button1;
	JButton Button2;
	JButton Button3;
	JButton Button4;
	JButton Button5;
	JButton Button6;
	JButton Button7;
	JButton Button8;
	JButton Button9;
	JButton Button10;
	JButton Button11;
	JButton Button12;
	JButton Button13;
	JButton Button14;
	JButton Button15;
	JButton Button16;
	JButton Button17;
	JButton Button18;
	JButton Button19;
	JButton Button20;
	JButton Button21;
	JButton Button22;
	JButton Button23;
	JButton Button24;
	JButton Button25;
	JButton Button26;
	JButton Button27;
	JButton Button28;
	JButton Button29;
	JButton Button30;
	
	
	int ClickState = 1;
	
	
	@Override
	void Start(JFrame CurrentFrame) {
		// TODO Auto-generated method stub
		System.out.println("Panel 3 generated");
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1000, 700);
		panel.setVisible(true);
		panel.setBackground(new Color(255-102- 0));
		
		label1 = new JLabel();
		label1.setText("Now Weve Passed the Firewall We got to find the files.");
		label1.setForeground(Color.WHITE);
		label1.setBounds(225, 250, 900, 100);
		label1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel.add(label1);
		
		Button1 = new JButton();
		Button1.setText("Again Supprised your Being So helpful");
		Button1.setBounds(350, 325, 300, 30);
		Button1.addActionListener(changeLabel1);
		
		Button2 = new JButton();
		Button2.setText("Your Files");
		Button2.addActionListener(changeLabel1);
		
		Button3 = new JButton();
		Button3.setText("Your Files");
		Button3.addActionListener(changeLabel1);
		
		Button4 = new JButton();
		Button4.setText("Your Files");
		Button4.addActionListener(changeLabel1);
		
		Button5 = new JButton();
		Button5.setText("Your Files");
		Button5.addActionListener(changeLabel1);
		
		Button6 = new JButton();
		Button6.setText("Your Files");
		Button6.addActionListener(changeLabel1);
		
		Button7 = new JButton();
		Button7.setText("Your Files");
		Button7.addActionListener(changeLabel1);
		
		Button8 = new JButton();
		Button8.setText("Your Files");
		Button8.addActionListener(changeLabel1);
		
		Button9 = new JButton();
		Button9.setText("Your Files");
		Button9.addActionListener(changeLabel1);
		
		Button10 = new JButton();
		Button10.setText("Your Files");
		Button10.addActionListener(changeLabel1);
		
		Button11 = new JButton();
		Button11.setText("Your Files");
		Button11.addActionListener(changeLabel1);
		
		Button12 = new JButton();
		Button12.setText("Your Files");
		Button12.addActionListener(changeLabel1);
		
		Button13 = new JButton();
		Button13.setText("Your Files");
		Button13.addActionListener(changeLabel1);
		
		Button14 = new JButton();
		Button14.setText("Your Files");
		Button14.addActionListener(changeLabel1);
		
		Button15 = new JButton();
		Button15.setText("Your Files");
		Button15.addActionListener(changeLabel1);
		
		Button16 = new JButton();
		Button16.setText("Your Files");
		Button16.addActionListener(changeLabel1);
		
		Button17 = new JButton();
		Button17.setText("Your Files");
		Button17.addActionListener(changeLabel1);
		
		Button18 = new JButton();
		Button18.setText("Your Files");
		Button18.addActionListener(changeLabel1);
		
		Button19 = new JButton();
		Button19.setText("Your Files");
		Button19.addActionListener(changeLabel1);
		
		Button20 = new JButton();
		Button20.setText("Your Files");
		Button20.addActionListener(changeLabel1);
		
		Button21 = new JButton();
		Button21.setText("Your Files");
		Button21.addActionListener(changeLabel1);
		
		Button22 = new JButton();
		Button22.setText("Your Files");
		Button22.addActionListener(changeLabel1);
		
		Button23 = new JButton();
		Button23.setText("Your Files");
		Button23.addActionListener(changeLabel1);
		
		Button24 = new JButton();
		Button24.setText("Your Files");
		Button24.addActionListener(changeLabel1);
		
		Button25 = new JButton();
		Button25.setText("Your Files");
		Button25.addActionListener(changeLabel1);
		
		Button26 = new JButton();
		Button26.setText("Your Files");
		Button26.addActionListener(changeLabel1);
		
		Button27 = new JButton();
		Button27.setText("Your Files");
		Button27.addActionListener(changeLabel1);
		
		Button28 = new JButton();
		Button28.setText("Your Files");
		Button28.addActionListener(changeLabel1);
		
		Button29 = new JButton();
		Button29.setText("Your Files");
		Button29.addActionListener(changeLabel1);
		
		Button30 = new JButton();
		Button30.setText("Your Files");
		Button30.addActionListener(changeLabel1);
		
		Textbox1 = new JTextField(30);
		Textbox1.setBounds(350, 325, 300, 30);
		Textbox1.addActionListener(changeLabel1);
		
		

		
		panel.add(label1);
		panel.add(Button1);
		//panel.add(Textbox1);
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
		
			if(ClickState == 1) {
				System.out.println("Part3 : Action1 check");
				//debug
				label1.setText("Well again had to give you a chance");
				label1.setLocation(300, 250);
				Button1.setText("Alrigh lets just get on with it");
				ClickState++;
			} else if (ClickState == 2) {
				System.out.println("Part3 : Action2 check");
				//debug
				label1.setText("Alright well its not to hard just click the button");
				Button1.setBounds(75, 30, 100, 30);
				Button1.setText("your files");
				ClickState++;
			} else if(ClickState == 3) {
				System.out.println("Part3 : Action3 check");
				//debug
				label1.setText("I mean close, but you missed try again");
				Button1.setBounds(250, 30, 100, 30);
				Button1.setText("your files");
				ClickState++;
			} else if(ClickState == 4) {
				System.out.println("Part3 : Action4 check");
				//debug
				label1.setText("Well now look what youve done you split into two ");
				Button1.setBounds(250, 30, 100, 30);
				Button1.setText("your files");
				panel.add(Button2);
				Button2.setBounds(250, 90, 100, 30);	
				ClickState++;
			} else if(ClickState == 5) {
				System.out.println("Part3 : Action5 check");
				//debug
				label1.setText("Really again just click the button");
				Button1.setBounds(350, 30, 100, 30);
				Button1.setText("your files");
				panel.add(Button3);
				panel.add(Button4);
				Button3.setBounds(600, 150, 100, 30);	
				Button4.setBounds(25, 75,100,30);
				ClickState++;
			} else if(ClickState == 6) {
				System.out.println("Part3 : Action6 check");
				//debug
				label1.setText("Your Starting to make a real mess you know");
	
				Button5.setBounds(600, 150, 100, 30);	
				Button6.setBounds(600, 467,100,30);
				Button7.setBounds(805, 300,100,30);
				Button8.setBounds(400, 105,100,30);
				Button9.setBounds(75, 500,100,30);
				Button10.setBounds(104, 200,100,30);
				Button11.setBounds(400, 400,100,30);
				Button12.setBounds(500, 200,100,30);
				panel.add(Button5);
				panel.add(Button6);
				panel.add(Button7);
				panel.add(Button8);
				panel.add(Button9);
				panel.add(Button10);
				panel.add(Button11);
				panel.add(Button12);
				panel.repaint();
				ClickState++;
			} else if (ClickState == 7) {
				System.out.println("Part3 : Action7 check");
				//debug
				
				label1.setText("K if you keep this up your going to crash everything");
				Button12.setBounds(104, 160,100,30);
				Button13.setBounds(500, 75,100,30);
				Button14.setBounds(700, 500,100,30);
				Button15.setBounds(600, 225,100,30);
				Button16.setBounds(200, 175,100,30);
				Button17.setBounds(100, 110,100,30);
				Button18.setBounds(357, 270,100,30);
				Button19.setBounds(467, 450,100,30);
				Button20.setBounds(760, 900,100,30);
				Button21.setBounds(175, 670,100,30);
				Button22.setBounds(546, 890,100,30);
				Button23.setBounds(260, 765,100,30);
				Button24.setBounds(750, 234,100,30);
				Button25.setBounds(120, 354,100,30);
				Button26.setBounds(650, 25,100,30);
				Button27.setBounds(340, 540,100,30);
				Button28.setBounds(220, 425,100,30);
				Button29.setBounds(460, 425,100,30);
				Button30.setBounds(750, 165,100,30);
				panel.add(Button13);
				panel.add(Button14);
				panel.add(Button15);
				panel.add(Button16);
				panel.add(Button17);
				panel.add(Button18);
				panel.add(Button19);
				panel.add(Button20);
				panel.add(Button21);
				panel.add(Button22);
				panel.add(Button23);
				panel.add(Button24);
				panel.add(Button25);
				panel.add(Button26);
				panel.add(Button27);
				panel.add(Button28);
				panel.add(Button29);
				panel.add(Button30);
				panel.repaint();	
				ClickState++;
			}else if(ClickState == 8) {
				System.out.println("Part3 : Action8 check");
				//debug
				label1.setText("Okay,Okay if we Keep going were going to crash the server, Just Take em");
				label1.setLocation(100,250);
				Button1.setBounds(350, 325, 300, 30);
				Button1.setText("Your Actual Files");
				
				panel.remove(Button2);
				panel.remove(Button3);
				panel.remove(Button4);
				panel.remove(Button5);
				panel.remove(Button6);
				panel.remove(Button7);
				panel.remove(Button8);
				panel.remove(Button9);
				panel.remove(Button10);
				panel.remove(Button11);
				panel.remove(Button12);
				panel.remove(Button13);
				panel.remove(Button14);
				panel.remove(Button15);
				panel.remove(Button16);
				panel.remove(Button17);
				panel.remove(Button18);
				panel.remove(Button19);
				panel.remove(Button20);
				panel.remove(Button21);
				panel.remove(Button22);
				panel.remove(Button23);
				panel.remove(Button24);
				panel.remove(Button25);
				panel.remove(Button26);
				panel.remove(Button27);
				panel.remove(Button28);
				panel.remove(Button29);
				panel.remove(Button30);
				panel.repaint();
				ClickState++;
			} else if (ClickState == 9) {
				label1.setText("So you have Found you stuff, Time to bring them back Home, For Narnia !!");
				Button1.setText("Alright lets go");
				ClickState++;
			} else if (ClickState == 10) {
				CleanUp();
			}
			
				
			
			}
		};

		
		
		
}
