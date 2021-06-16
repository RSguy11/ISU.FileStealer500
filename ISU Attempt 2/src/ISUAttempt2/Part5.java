package ISUAttempt2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Part5 extends PanelBase{

	JPanel panel;
	JLabel label1;
	JButton Button1;
	JButton Button2;
	JButton Button3;

	int ClickState = 1;
	
	@Override
	void Start(JFrame CurrentFrame) {
		// TODO Auto-generated method stub
		
		System.out.println("panel 5");
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1000, 700);
		panel.setVisible(true);
		panel.setBackground(Color.BLACK);
		
		Button1 = new JButton();
		Button1.setText("We did it");
		Button1.setBounds(350, 325, 300, 30);
		Button1.addActionListener(changeLabel1);
		
		
		label1 = new JLabel();
		label1.setText("Congratulations, you got your files Back!");
		label1.setForeground(Color.WHITE);
		label1.setBounds(300, 250, 900, 100);
		label1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		panel.add(Button1);
		panel.add(label1);
		panel.repaint();
		MainClass.frame1.getContentPane().add(panel);
		
		
	}

	void CleanUp() {
		panel.setVisible(false);	
		MainClass.NextPanel();
	}
	
	AbstractAction changeLabel1 = new AbstractAction () {
		@Override
		    public void actionPerformed(ActionEvent e) {
			
			
			if (ClickState== 1) {
				System.out.println("Part 5: Action1 Preformed");
				//debug check
				
				label1.setText("Now we Get to go Through and do it all again");
			Button1.setText("What ?");
				label1.setLocation(250, 250);
				panel.repaint();
				ClickState++;
			} else if (ClickState== 2) {
				System.out.println("Part 5: Action2 Preformed");
				//debug check
				CleanUp();
				
			}
				
			}
		};
	
	
	
}
