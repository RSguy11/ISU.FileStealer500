package ISUAttempt2;

import javax.swing.JFrame;

public class MainClass {

	static int currentPanel;
	static JFrame frame1;
	static PanelBase[] panels;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JFrame 
		frame1 = new JFrame("Frame1");
		frame1.setLayout(null);
		frame1.setSize(1000, 700);
		frame1.setVisible(true);
		frame1.setLocation(500, 200);	
		
		// panel creation section
		//PanelBase[] 
	    panels = new PanelBase[6];
		
		panels[0] = new Part1();
		panels[1] = new Part2();
		panels[2] = new Part3();
		panels[3] = new Part4(); 
		panels[4] = new Part6();
		panels[5] = new Part5();
		
		
		// execute
	//currentPanel = 1;
	//currentPanel = 0;
	currentPanel = -1;
	 
	  
		NextPanel();		
	}
	
	static void NextPanel()
	{
		currentPanel ++;
		
		if (currentPanel < panels.length){	
			panels[currentPanel].Start(frame1);
		} else  if  (currentPanel >= panels.length){
				currentPanel = 0;	
			panels[currentPanel].Start(frame1);
		}
					
			
		
				
	}
	

}
