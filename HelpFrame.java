
package GUI;

//imports
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.Binding;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

 


public class HelpFrame {

	//Swing Components
	static JFrame HelpWindow = new JFrame();
	
	static JButton DisplayButton = new JButton("Display");
	static JComboBox<String> HelpSelection = new JComboBox<>();
	static JLabel TitleLabel = new JLabel("Help Screen");
	static JLabel HelpLabel = new JLabel("<html>This Window is designed to help you get used to the Look and Feel of the CAI.<br> If you ever need help, come back to this menu.");
	String item;
	
//Constructor
HelpFrame(){
	
	//Call the FillHelpBox and FillFrames functions.
	FillHelpBox();
	FillFrames();
	
	//ItemListener to listen for Item changes in JComboBox
			HelpSelection.addItemListener(event -> {//Item listener scope start

				//Will store the current selection in the JComboBox
				item = (String) event.getItem();
			


			});//Item listener scope end
			

			//ActionListener to listen for clicks on DisplayButton
			DisplayButton.addActionListener(new ActionListener() {//action listener scope start

				
				//Action performed when an action is fired.
				@Override
				public void actionPerformed(ActionEvent e) {

					//If statements checking the contents of item, and executing the proper commands based on the content.
					if(item.trim().equals("Starting out")) {
						JOptionPane.showMessageDialog(HelpWindow, "Welcome to an CAI designed to help you understand the vast existance of Arrays. "
							+ "\n When you start, a Start Window will open, and offer 3 choices. Start, Help, and Exit. Press Start to start the learning."
							+ "\n Press the Help button to access this window, and press the Exit Window to exit the Application.", "Starting Out", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java25.PNG"));
						
					}
					
					else if(item.trim().equals("Sections/Progress")) {
						JOptionPane.showMessageDialog(HelpWindow, "The Main CAI consists of 4 sections. Every section holds information regarding a certain aspect of Arrays."
								+ "\n 'What are Arrays?' gives an introduction to what Arrays are, what they consist of, and what they can be used for"
								+ "\n 'Creating an Array' shows the different ways to construct and design an Array."
								+ "\n 'Manipulating Arrays' shows the different ways to use Arrays, and the different basic tools that come with them." 
								+ "\n 'ArrayLists' gives a brief introduction to ArrayLists, what they are used for, and the basic tools that come with them."
								+ "\n Each section holds vast information, and a quick 'Check your Understanding' Question. "
								+ "\n After completing a section, you will see the progress bar go up 25%. Reading the same section again will not increase it."
								+ "\n After getting to 100%, you will then be presented the Activity." ,"Section/Progress", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java26.PNG"));
					}
					
					else if(item.trim().equals("Activity")) JOptionPane.showMessageDialog(HelpWindow, "The Activity is a Interactive Coding Session! "
							+ "\n Here you will be presented with a problem, and you will have to code it out!"
							+ "\n When done, press the submit button. The program will then tell you if you're right or wrong."
							+ "\n Be careful! Syntax is everything!"
							+ "\n If completed, the test button will open. ", "Activity", JOptionPane.INFORMATION_MESSAGE);
					
					else if(item.trim().equals("Test")) JOptionPane.showMessageDialog(HelpWindow, "A test window will open up. This will be the biggest challenge. "
							+ "\n There are 7 questions. "
							+ "\nThere is no time limit, so take all the time you need. "
							+ "\n You will not be able to access the other windows."
							+ "\n When done, press submit."
							+ "\n All the questions you got wrong will pop up red, and all the correct ones green."
							+ "\n Your final score will be at the bottom. An back button will take you all the way back to the start screen."
							+ "\n Congratulations! You completed your training.", "Test", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java27.PNG"));

					
					else if(item.trim().equals("AfterMath")) JOptionPane.showMessageDialog(HelpWindow, " After, you can still go over all of the sections if you wish. Your progress will be saved. Have fun!", "AfterMath", JOptionPane.INFORMATION_MESSAGE);

					

				}

			});//action listener scope end

			HelpWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

//Filling the JComboBox with options
private void FillHelpBox() {
	HelpSelection.addItem("Starting out");
	HelpSelection.addItem("Sections/Progress");
	HelpSelection.addItem("Test");
	HelpSelection.addItem("AfterMath");
}

//Filling the frames by setting bounds to the Swing Components, and adding them to the frame. Then setting the frame up.
private void FillFrames() {
	TitleLabel.setBounds(10,-30,300,100);
	TitleLabel.setFont(new Font("Ariel", Font.BOLD, 20));
	
	DisplayButton.setBounds(10, 150,100,25);
	
	HelpSelection.setBounds(10,100,200,25);
	
	HelpLabel.setBounds(10,10,1000,100);
	
	HelpWindow.add(TitleLabel);
	HelpWindow.add(HelpSelection);
	HelpWindow.add(DisplayButton);
	HelpWindow.add(HelpLabel);
	
	HelpWindow.setTitle("Help Screen");
	HelpWindow.setLayout(null);
	HelpWindow.setSize(500,500);
	HelpWindow.setVisible(true);
}
}