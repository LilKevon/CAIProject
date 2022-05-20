
//package
package GUI;

//Imports
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//Public class SelectionWindow that extends JPanel
@SuppressWarnings("serial")
public class SelectionWindow extends JPanel{
	static JFrame SelectionFrame = new JFrame();
	static int IncomingNumber = 0;
	static int ProgressTrack = 0;
	static JProgressBar bar = new JProgressBar();
	static JButton Section1Button = new JButton("What are Arrays?");
	static JButton Section2Button = new JButton("Creating an Array");
	static JButton Section3Button = new JButton("Manipulating Arrays");
	static JButton Section4Button = new JButton("ArrayLists");
	static JLabel TitleLabel= new JLabel("<html> Welcome to the Selection Window!<br> Click a Section to start reading!");
	static JLabel ProgressLabel = new JLabel("Progress");
	static JLabel SectionLabel = new JLabel("Sections");
	static JButton BackButton = new JButton("Back");
	static ImageIcon Picture = (new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Check.png"));
	 static Image scaleImage = Picture.getImage().getScaledInstance(150, 100,Image.SCALE_DEFAULT);
	 static ImageIcon a = new ImageIcon(scaleImage);
	
	 static JLabel Ending = new JLabel(" ");
	 
	 static JButton ActivityButton  = new JButton("Activity");

//Constructor with int a parameters
SelectionWindow(int a){
	
	//Set IncomingNumber as a(inputted number).
	IncomingNumber = a;
	
	//Create a new ProgressChecker called Check
	ProgressChecker Check = new ProgressChecker();

	//Add the int returned by Check.ProgressChecker(a) to ProgressTrack
	ProgressTrack+= Check.ProgressCheck(a);
	
	
	//Call ProgressBarFill, WindowSetup, FillWindow, CheckProgress
	ProgressBarFill();
	WindowSetup();
	FillWindow();
	CheckProgress();
	
	//BackButton ActionListener. This opens a new StartWindow, and disposes of the current window.
	BackButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e ) {
			
			new StartWindow();
			SelectionFrame.dispose();		}
	});
	
	//Section1Button ActionListener, which opens a new Section1 Window and disposes of the current window.
	Section1Button.addActionListener(new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		 new Section1Window();
			SelectionFrame.dispose();
		
			
			}
		
		
	});
	
	//Section2Button ActionListener, which opens a new Section2 Window and disposes of the current window.
	Section2Button.addActionListener(new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
		new Section2Window();
			SelectionFrame.dispose();
		}
	});
	
	//Section3Button ActionListener, which opens a new Section3 Window and disposes of the current window.
	Section3Button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e ) {
			
			new Section3Window();
			SelectionFrame.dispose();			
		}
		
		
	});
	
	//Section4Button ActionListener, which opens a new Section4 Window and disposes of the current window.
	Section4Button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			new Section4Window();
			SelectionFrame.dispose();
		}
	});
	
	//ActivityButton ActionListener. Creates a new ActivityWindow, and dispose of the current window.
	ActivityButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new ActivityWindow();
			SelectionFrame.dispose();
		}
	});
	
	//DefaultCloseOperation to DISPOSE_ON_CLOSE.
	SelectionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
}

//void CheckProgress Method
void CheckProgress() {
	
	//Create a new temporary JLabel called poss and store a checkmark.
	JLabel poss = new JLabel(a);
	
	//If IncomingNumber is 25, then set a checkmark at Section1 Title.
	if(IncomingNumber == 25) poss.setBounds(165,165,30,30);
	
	//If IncomingNumber is 50, then set a checkmark at Section1 Title.
	if(IncomingNumber == 50) poss.setBounds(165,245,30,30);
	
	//If IncomingNumber is 75, then set a checkmark at Section1 Title.
	if(IncomingNumber == 75) poss.setBounds(165,315,30,30);
	
	//If IncomingNumber is 100, then set a checkmark at Section1 Title.
	if(IncomingNumber == 100) poss.setBounds(165,395,30,30);
	
	//If ProgressTracking is 100, then allow visibility to ActivityButton and add the ActivityButton to SelectionWindow.
	if(ProgressTrack == 100) {
		ActivityButton.setBounds(300,400,100,30);
		SelectionFrame.add(ActivityButton);
	}

	//Adding poss to SelectionFrame
	SelectionFrame.add(poss);
	
}

//void method ProgressBarFill
void ProgressBarFill(){


	//Set the progress bar bounds.
	bar.setBounds(0,80,300,25);

	//Renders a process string. This is the number at the middle of the bar that constantly rises with the bar
	bar.setStringPainted(true);

	//Set the font of the process string
	bar.setFont(new Font("Ariel", Font.BOLD, 25));

	//Set the bar foreground to red
	bar.setForeground(Color.RED);

	//Set the bar background to white
	bar.setBackground(Color.WHITE);
	
	//Set the value of bar to ProgressTrack
	bar.setValue(ProgressTrack);
	
}

//void FillWindow method
void FillWindow() {
	
	
	//Set Fonts and Bounds to all of the JLabel Components	
	SectionLabel.setBounds(0,110,100,100);
	SectionLabel.setFont(new Font("Serif", Font.BOLD, 17));
	
	ProgressLabel.setBounds(0,20,100,100);
	
	TitleLabel.setFont(new Font("Serif", Font.BOLD, 17));
	TitleLabel.setBounds(5,-100,600,250);
	
	Section1Button.setBounds(10,175,150,25);
	Section2Button.setBounds(10,250,150,25);
	Section3Button.setBounds(10,325,150,25);
	Section4Button.setBounds(10,400,150,25);

	BackButton.setBounds(300,175,100,30);
	SelectionFrame.add(SectionLabel);
	SelectionFrame.add(ProgressLabel);
	SelectionFrame.add(TitleLabel);
	
	SelectionFrame.add(bar);
	SelectionFrame.add(BackButton);
	SelectionFrame.add(Section1Button);
	SelectionFrame.add(Section2Button);
	SelectionFrame.add(Section3Button);
	SelectionFrame.add(Section4Button);
	
	SelectionFrame.add(Ending);
	
	
	
}

//void WindowSetup Window
void WindowSetup() {
	
	//Setting up the Window so that it displays with a title, no layout, and a custom size.	
	SelectionFrame.setLayout(null);
	SelectionFrame.setSize(500,500);
	SelectionFrame.setTitle("Selection Screen");
	SelectionFrame.setVisible(true);
	
	
	
}






	
}
