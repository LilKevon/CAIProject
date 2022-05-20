//package
package GUI;

//Imports
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

//public class Section3Window
public  class Section3Window {
	
	static int Done = 0;
	
	//Java Swing Components
	static JFrame Section3Frame = new JFrame();
	static JLabel Information3Title = new JLabel("Manipulating Arrays");

	static JLabel Information3 = new JLabel("<html> In this section, we will learn what we can do with Arrays."
			+ "<br>There are many things we can do with Arrays in order to make them more efficient. "
			+ "<br> Although there are many things we can do with Arrays, here are the basics utilities that we can use below:");


	static JLabel SortLabel  = new JLabel("Sorting an Array");
	static JLabel SortImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java7.PNG"));
	static JLabel SortCaption = new JLabel("<html>Figure 0.5: Sorting an Array using Arrays.sort().<br> You need to import this from the Java.util library!"
			+ "<br> The output would be 3 4 5 7 10.");

	static JLabel ChangeLabel = new JLabel("Changing an Element of the Array");
	static JLabel ChangeImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java8.PNG"));
	static JLabel ChangeCaption = new JLabel("<html> Figure 0.6: Changing elements of an array. <br> Remember, Arrays are 0-indexed, which means"
			+ "<br> the second and third elements are being changed,<br> not the first and second ones. The output will be 1 5 6 4 5.");

	static JLabel SearchLabel = new JLabel("Searching the Array");
	static JLabel SearchImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java9.PNG"));
	static JLabel SearchCaption = new JLabel("<html>Figure 0.7: Searching for the element 1 in the array<br> "
			+ "using Linear Search. With Arrays, many search algorithms are possible. "
			+ "<br> the output will be Element found at index 5");

	static JLabel LengthLabel = new JLabel(".length()");
	static JLabel LengthImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java10.PNG"));
	static JLabel LengthCaption = new JLabel("<html>Figure 0.8: .length() is a int method returning the <br>"
			+ "length of the array. It isn't 0-indexed, so the <br>"
			+ "length will be the number of elements. The output is 7. ");

	static JLabel AccessLabel = new JLabel("Accessing a Element");
	static JLabel AccessImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java11.PNG"));
	static JLabel AccessCaption = new JLabel("<html>Figure 0.9: Accessing the element in array 'a' at index <br> "
			+ "2. The output will be 3.");

	static JLabel ToArrayLabel = new JLabel("ToCharArray");
	static JLabel ToArrayImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java12.PNG"));
	static JLabel ToArrayCaption = new JLabel("<html>Figure 1.0: Only used when converting Strings. This method <br>"
			+ "allows us to convert the characters in a String into a char Array.<br>"
			+ "Useful when wanting to work with the characters individually.");



	static JLabel UnderstandingCheckTitle= new JLabel("Check your Understanding!");

	static JLabel UnderstandingCheckQuestion = new JLabel("What will this program output? ");
	static JLabel UnderstandingCheckImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java13.PNG"));

	static JRadioButton ButtonOption1 = new JRadioButton("A. Found! and 5");
	static JRadioButton ButtonOption2 = new JRadioButton("B. 2");
	static JRadioButton ButtonOption3 = new JRadioButton("C. Found! and 4");
	static JRadioButton ButtonOption4 = new JRadioButton("D. Runtime Error");
	static ButtonGroup Understanding = new ButtonGroup();

	static JButton SubmitButton = new JButton("Submit");

	static JButton ContinueButton = new JButton("Continue");

	static JLabel Answer = new JLabel("");

	//Constructor
	public Section3Window() {

		//Calling WindowsSetUp, FillButtonGroup, FillWindows

		WindowSetUp();
		FillWindow();
		addButtonGroup();

		//AddActionListener SubmitButton. This is to submit answer for the Check Your Understanding!, and to check whether it was right or not.

		SubmitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Create a String variable called isCorrect which holds "none".
				String isCorrect = "none";
				
				//Checks whether the right button was selected, and outputs the corresponding message.
				if(ButtonOption1.isSelected()) isCorrect = "yes";
				else if(ButtonOption2.isSelected() || ButtonOption3.isSelected() || ButtonOption4.isSelected()) isCorrect = "no";               

				if(isCorrect.equals("yes")) {
					Answer.setText("<html>Correct! Option A is correct! The for loop outputs Found! and the"
							+ "output statement outputs 5, as the array has a length of 5.");	
					Done = 75;
				}

				else if(isCorrect.equals("no")) {
					Answer.setText("Sorry... Incorrect.");

				}



			}


		});
		//Continue Button Action Listener. This will display the next window.
		ContinueButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//Call new instance of SelectionWindow with parameter in 75.
				new SelectionWindow(Done);
				
				//dispose of current window.
				Section3Frame.dispose();

			}

		});
		
		//Set DefaultCloseOperation to dipose on close.
		Section3Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);;

	}
	//Static void method called addButtonGroup
	static void addButtonGroup() {
		
		//Adding JRadioButtons to Understanding ButtonGroup in order to prevent multiple selection of JButton
		Understanding.add(ButtonOption1);
		Understanding.add(ButtonOption2);
		Understanding.add(ButtonOption3);
		Understanding.add(ButtonOption4);

	}
	
	//Static void method called FillWindows
	static void FillWindow() {
		
		Font LabelFont = new Font("Ariel", Font.BOLD, 19);
		Font CaptionFont = new Font("Ariel", Font.ITALIC,12);
		
		//Create an border for all of the JLabels
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		
		//Setting fonts and bounds for all of the Text and Image JLabels.
		Information3Title.setFont(new Font("Ariel", Font.BOLD, 25));
		Information3Title.setBounds(0,-25,1000,100);

		Information3.setFont(new Font("Ariel", Font.BOLD, 14));
		Information3.setBounds(0, 30,1000,100);

		SortLabel.setFont(LabelFont);
		SortLabel.setBounds(10,115,200,100);
		SortImage.setBorder(border);
		SortImage.setBounds(10,180, 260,45);
		SortCaption.setFont(CaptionFont);
		SortCaption.setBounds(10,200,1000,100);

		ChangeLabel.setFont(LabelFont);
		ChangeLabel.setBounds(10,260,350,100);
		ChangeImage.setBorder(border);
		ChangeImage.setBounds(10,325, 170,60);
		ChangeCaption.setFont(CaptionFont);
		ChangeCaption.setBounds(10,365,1000,100);

		SearchLabel.setFont(LabelFont);
		SearchLabel.setBounds(10,440, 200, 100);
		SearchImage.setBorder(border);
		SearchImage.setBounds(10,505, 492,94);
		SearchCaption.setFont(CaptionFont);
		SearchCaption.setBounds(10,575, 1000,100);

		LengthLabel.setFont(LabelFont);
		LengthLabel.setBounds(10,635,200,100);
		LengthImage.setBorder(border);
		LengthImage.setBounds(10,700,220,51);
		LengthCaption.setFont(CaptionFont);
		LengthCaption.setBounds(10,730,1000,100);

		AccessLabel.setFont(LabelFont);
		AccessLabel.setBounds(600,115, 200,100);
		AccessImage.setBorder(border);
		AccessImage.setBounds(600,180,157,49);
		AccessCaption.setFont(CaptionFont);
		AccessCaption.setBounds(600,200, 1000,100);

		ToArrayLabel.setFont(LabelFont);
		ToArrayLabel.setBounds(600,255,200,100);
		ToArrayImage.setBorder(border);
		ToArrayImage.setBounds(600,320,295,49);
		ToArrayCaption.setFont(CaptionFont);
		ToArrayCaption.setBounds(600,345,1000,100);


		UnderstandingCheckTitle.setFont(LabelFont);
		UnderstandingCheckTitle.setBounds(600,440,270,100);

		UnderstandingCheckQuestion.setFont(new Font("Ariel", Font.BOLD, 13));
		UnderstandingCheckQuestion.setBounds(600,460,270,100);
		UnderstandingCheckImage.setBounds(600,520,373,96);
		UnderstandingCheckImage.setBorder(border);
		ButtonOption1.setBounds(600,620,125,30);
		ButtonOption2.setBounds(600,650,125,30);
		ButtonOption3.setBounds(600,680,125,30);
		ButtonOption4.setBounds(600,710,125,30);
		SubmitButton.setBounds(600,740,100,30);
		Answer.setBounds(600,770,280,80);
		ContinueButton.setBounds(800,900,100,30);

		Section3Frame.add(ContinueButton);

		Section3Frame.add(Answer);
		Section3Frame.add(SubmitButton);

		Section3Frame.add(ButtonOption1);
		Section3Frame.add(ButtonOption2);
		Section3Frame.add(ButtonOption3);
		Section3Frame.add(ButtonOption4);


		Section3Frame.add(UnderstandingCheckImage); 
		Section3Frame.add(UnderstandingCheckQuestion);
		Section3Frame.add(UnderstandingCheckTitle);


		Section3Frame.add(ToArrayLabel);
		Section3Frame.add(ToArrayCaption);
		Section3Frame.add(ToArrayImage);


		Section3Frame.add(AccessLabel);
		Section3Frame.add(AccessImage);
		Section3Frame.add(AccessCaption);


		Section3Frame.add(LengthLabel);
		Section3Frame.add(LengthImage);
		Section3Frame.add(LengthCaption);



		Section3Frame.add(SearchLabel);
		Section3Frame.add(SearchImage);
		Section3Frame.add(SearchCaption);


		Section3Frame.add(ChangeLabel);
		Section3Frame.add(ChangeImage);
		Section3Frame.add(ChangeCaption);

		Section3Frame.add(SortLabel);
		Section3Frame.add(SortImage);
		Section3Frame.add(SortCaption);
		Section3Frame.add(Information3);
		Section3Frame.add(Information3Title);
	}

	//Static void method called WindowSetUp
	static void WindowSetUp() {

		//Setting up the Window so that it displays with a title, no layout, and a custom size.
		Section3Frame.setSize(1000,1000);
		Section3Frame.setLayout(null);
		Section3Frame.setTitle("Manipulating Arrays");
		Section3Frame.setVisible(true);

	}

}
