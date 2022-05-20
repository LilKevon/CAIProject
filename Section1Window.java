//package
package GUI;

//Imports
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;


//public class Section1Window
public class Section1Window  {

	//Java Swing Components
	static  JFrame Section1Frame = new JFrame();
	static int Done = 0;
	static JLabel Information1 = new JLabel("<html><br> An Array is a Data Structure that holds a fixed amount of values of a single type. <br>"
			+ "<br> First deployed in Java 8, They are extremely beneficial when a programmer wishes to store multiple elements of a single type. <br>"
			+ "Think of it as a storage unit, where multiple lockers are in a row. --> [][][][][]. Each of these lockers can store one thing. However, <br>"
			+ "the utility of arrays comes into full effect when you need multiple inputs. After inputing all the values, you then need to operate on them. <br>"
			+ "If stored, the array can easily look up the element you request, and pull it out for you.<br> <br>"
			+ "When using Arrays, there are a few things to note: <br>" 
			+ "-Arrays are immutable, meaning that once you create one, you cannot change the size(length) of it. <br>"
			+ "-You can change the elements inside the Array. <br>"
			+ "-Arrays are 0-indexed, meaning that if the length of the array is 4, then the index of the lockers would be [0][1][2][3] <br>"
			+ "-Arrays can only store one type of data. This means that you cannot store different types such as int and string together.<br>"
			+ "-Arrays are built into Java. There is no need to import any libraries in order to use them.");

	
	static JLabel Information2Caption = new JLabel("Why Arrays?");

	static JLabel Information2 = new JLabel("<html> Arrays are extremely useful for many things, but there are 3 main uses for Arrays."
			+ "<br>1.Storing a group of data."
			+ "<br>2.Sorting a group of data."
			+ "<br>3.Searching for the exact position of a specific element."
			+ "<br>In the next section you will learn about how to create an array, and what limits you have when creating one.");

	static JLabel IntroLabel = new JLabel("Introduction to Arrays");

	static JLabel Section1ImageCaption = new JLabel("Figure 0.1: A diagram explaining all the components of an array with a length of 10. ");

	static JLabel Section1Image = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Section1Image.PNG")); 

	static JLabel UnderstandingCheckCaption = new JLabel("Check your Understanding!");

	static JLabel UnderstandingCheckQuestion = new JLabel("(T/F)After creating an Array, the length can be changed.");

	static JRadioButton ButtonTrue = new JRadioButton("True");
	static JRadioButton ButtonFalse = new JRadioButton("False");
	static ButtonGroup Understanding = new ButtonGroup();

	static JButton SubmitButton = new JButton("Submit");

	static JButton ContinueButton = new JButton("Continue");

	static JLabel Answer = new JLabel("");


	//Constructor
	 Section1Window(){
		
		//Calling WindowsSetUp, FillButtonGroup, FillWindows
		WindowSetUp();
		FillButtonGroup();
		FillWindows();
		
		//AddActionListener SubmitButton. This is to submit answer for the Check Your Understanding!, and to check whether it was right or not.
		SubmitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Create a String variable called isCorrect which holds "none".
				String isCorrect = "none";
				
				//Checks whether the right button was selected, and outputs the corresponding message.
				if(ButtonTrue.isSelected()) isCorrect = "true";
				else if(ButtonFalse.isSelected()) isCorrect = "false";

				if(isCorrect.equals("false")) {
					Answer.setText("Good job! Once a Array is created, it's size cannot be changed. This is called being immutable.");	
					Done = 25;
				}

				else if(isCorrect.equals("true")) {
					Answer.setText("Sorry... Incorrect. Once a Array is created, it's size cannot be changed. This is called being immutable.");
				}

			}		
		});


		//Continue Button Action Listener. This will display the next window.
		ContinueButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Call new instance of SelectionWindow with parameter in 25.
				 new SelectionWindow(Done);
				 
				 //dispose of current window.
				Section1Frame.dispose();
			}


		});

		//Set DefaultCloseOperation to dipose on close.
		Section1Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


	}


	 //Static void method called FillButtonGroup
	static void FillButtonGroup(){
		
		//Adding JRadioButtons to Understanding ButtonGroup in order to prevent multiple selection of JButton
		Understanding.add(ButtonTrue);
		Understanding.add(ButtonFalse);
	}

	//Static void method called FillWindows
	static void FillWindows() {
		
		//Create an border for all of the JLabels
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);

		//Setting fonts and bounds for all of the Text and Image JLabels.
		IntroLabel.setFont(new Font("Ariel", Font.BOLD, 25));
		IntroLabel.setBounds(5,-20,1000,100);

		Information1.setFont(new Font("Ariel", Font.BOLD, 14));
		Information1.setBounds(5,-325,1000,1000);

		Section1Image.setBorder(border);
		Section1Image.setBounds(0,315,375,169);

		Section1ImageCaption.setFont(new Font("Ariel", Font.ITALIC, 12));
		Section1ImageCaption.setBounds(0,445, 1000,100);

		Information2Caption.setFont(new Font("Ariel", Font.BOLD, 19));
		Information2Caption.setBounds(0,500,1000,100);

		Information2.setFont(new Font("Ariel", Font.BOLD, 14));
		Information2.setBounds(0,565,1000,100);

		UnderstandingCheckCaption.setFont(new Font("Ariel", Font.BOLD, 19));
		UnderstandingCheckCaption.setBounds(13,650,1000,100);

		UnderstandingCheckQuestion.setFont(new Font("Ariel", Font.BOLD, 14));
		UnderstandingCheckQuestion.setBounds(13,680, 1000,100);


		ButtonTrue.setBounds(13,750 ,100,30);
		ButtonFalse.setBounds(13,780,100,30);

		SubmitButton.setBounds(13,820, 100,30);

		Answer.setBounds(15,860,630,12);

		ContinueButton.setBounds(800,900,100,30);


		Section1Frame.add(Answer);
		Section1Frame.add(ContinueButton); 
		Section1Frame.add(SubmitButton);
		Section1Frame.add(ButtonFalse);
		Section1Frame.add(ButtonTrue);
		Section1Frame.add(UnderstandingCheckQuestion);
		Section1Frame.add(UnderstandingCheckCaption);
		Section1Frame.add(Information2Caption);
		Section1Frame.add(Information2);
		Section1Frame.add(Section1ImageCaption);
		Section1Frame.add(Information1);
		Section1Frame.add(Section1Image);
		Section1Frame.add(IntroLabel);


	}

	//Static void method called WindowSetUp
	static void WindowSetUp(){

		//Setting up the Window so that it displays with a title, no layout, and a custom size.
		Section1Frame.setTitle("What are Arrays?");

		Section1Frame.setLayout(null);

		Section1Frame.setSize(1000,1000);

		Section1Frame.setVisible(true);

	}






}
