//package
package GUI;

//Imports
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

//public class Section4Window
public class Section4Window {

	static int Done = 0;
	
	//Java Swing Components
	static JFrame Section4Frame = new JFrame();

	static JLabel Section4Title = new JLabel("ArrayLists");
	static JLabel Information4 = new JLabel("<html>We have learned that Arrays have a fixed length. This means that no matter what,"
			+ "<br>We must know the length of our array. If not, then we can't use them effectivly."
			+ "<br>Enter the ArrayList. ArrayLists are very similar to how Arrays work. The major"
			+ "<br>difference is that an ArrayList is dynamic. This means that its size can change"
			+ "<br>depending on what how much space you need. Below is how you declare one:");


	static JLabel Information4Image = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java14.PNG"));

	static JLabel Information45 = new JLabel("<html>The commented declaration is a general declaraction. The declaration below that"
			+ "<br>is for a ArrayList that holds Integers. Integers are wrappers for ints. In simple "
			+ "<br>terms, Wrappers box a primitive value into a object. This allows us to ultilize "
			+ "<br>these values as if they were objects. Here are some methods you can do with ArraysList.");

	static JLabel AddLabel = new JLabel(".add()");
	static JLabel AddImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java15.PNG"));
	static JLabel AddCaption = new JLabel("<html>Figure 1.3: .add() adds items to the ArrayList. Applies the FIFO method(First In First Out)."
			+ " <br>The output will, if outputing the items in MyArray, will be 5 6.");

	static JLabel GetLabel = new JLabel(".get()");
	static JLabel GetImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java17.PNG"));
	static JLabel GetCaption = new JLabel("<html>Figure 1.4: .get() gets an item at the index specified. If it is out of bounds,"
			+ "<br>an exception is thrown. The output is 10.");

	static JLabel ClearLabel = new JLabel(".clear()");
	static JLabel ClearImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java18.PNG"));	
	static JLabel ClearCaption = new JLabel("Figure 1.5: .clear() clears all items in an ArrayList.");

	static JLabel IndexLabel =new JLabel(".IndexOf()");
	static JLabel IndexImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java19.PNG"));
	static JLabel IndexCaption = new JLabel("Figure 1.6: .IndexOf() finds the index of a specified value. If not found, -1 is returned. "
			+ "The output is 0");

	static JLabel isEmptyLabel = new JLabel(".isEmpty()");
	static JLabel isEmptyImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java20.PNG"));
	static JLabel isEmptyCaption = new JLabel("Figure 1.7: .isEmpty() checks if the ArrayList is empty. Returns true if it is, returns false if it is not.");

	static JLabel UnderstandingCheckTitle= new JLabel("Check your Understanding!");

	static JLabel UnderstandingCheckQuestion = new JLabel("What will this program output? ");
	static JLabel UnderstandingCheckImage = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java21.PNG"));

	static JRadioButton ButtonOption1 = new JRadioButton("A. 10 false 7 false");
	static JRadioButton ButtonOption2 = new JRadioButton("B. 15 true 2 false");
	static JRadioButton ButtonOption3 = new JRadioButton("C. 20 true 4 false");
	static JRadioButton ButtonOption4 = new JRadioButton("D. Runtime Error");
	static ButtonGroup Understanding = new ButtonGroup();

	static JButton SubmitButton = new JButton("Submit");    

	static JLabel Answer = new JLabel("");


	static JButton ContinueButton = new JButton("Continue");

	//Constructor
	public Section4Window() {

		//Calling WindowsSetUp, FillButtonGroup, FillWindows	
		WindowSetUp();
		FillWindows();
		AddButtonGroup();

		//Continue Button Action Listener. This will display the next window.
		ContinueButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//dipose of current window.
				Section4Frame.dispose();
				
				//Call new instance of SelectionWindow with parameter in 100.
				new SelectionWindow(Done);


			}


		});

		//AddActionListener SubmitButton. This is to submit answer for the Check Your Understanding!, and to check whether it was right or not.
		SubmitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//Create a String variable called isCorrect which holds "none".
				String isCorrect = "none";
				if(ButtonOption3.isSelected()) isCorrect = "yes";
				else if(ButtonOption1.isSelected() || ButtonOption2.isSelected() || ButtonOption4.isSelected()) isCorrect = "no";               

				if(isCorrect.equals("yes")) {
					Answer.setText("<html>Correct! Option C is Correct! The get statement outputs 20. The contains "
							+ "statement outputs true,<br> the indexOf statement outputs 4 and the isEmpty statement outputs false.");	
					Done = 100;
				}

				else if(isCorrect.equals("no")) {
					Answer.setText("Sorry... Incorrect.");

				}



			}


		});



		//Set DefaultCloseOperation to dipose on close.
		Section4Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}

	 //Static void method called AddButtonGroup
	static void AddButtonGroup() {
		
		//Adding JRadioButtons to Understanding ButtonGroup in order to prevent multiple selection of JButton
		Understanding.add(ButtonOption1);
		Understanding.add(ButtonOption2);
		Understanding.add(ButtonOption3);
		Understanding.add(ButtonOption4);


	}
	
	//Static void method called FillWindows
	static void FillWindows() {

		//Create an border for all of the JLabels
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);


		Font LabelFont = new Font("Ariel", Font.BOLD, 19);
		Font CaptionFont = new Font("Ariel", Font.ITALIC,12);

		//Setting fonts and bounds for all of the Text and Image JLabels.
		Section4Title.setFont(LabelFont);
		Section4Title.setBounds(0,-33,100,100);

		Information4.setFont(new Font("Ariel", Font.BOLD, 13));
		Information4.setBounds(0,-125,1000,400);

		Information4Image.setBorder(border);
		Information4Image.setBounds(0,130,419,67);

		Information45.setFont(new Font("Ariel", Font.BOLD, 13));
		Information45.setBounds(0,140,1000,200);

		AddLabel.setFont(LabelFont);
		AddLabel.setBounds(0,210,200,200);
		AddImage.setBorder(border);
		AddImage.setBounds(0,325,348,57);
		AddCaption.setFont(CaptionFont);
		AddCaption.setBounds(0,350,1000,100);

		GetLabel.setFont(LabelFont);
		GetLabel.setBounds(0, 340, 200,200);
		GetImage.setBorder(border);
		GetImage.setBounds(0,455,344,61);
		GetCaption.setFont(CaptionFont);
		GetCaption.setBounds(0,481,1000,100);

		ClearLabel.setFont(LabelFont);
		ClearLabel.setBounds(0,520, 1000,100);
		ClearImage.setBorder(border);
		ClearImage.setBounds(0,585,349,43);
		ClearCaption.setFont(CaptionFont);
		ClearCaption.setBounds(0,588, 1000,100);

		IndexLabel.setFont(LabelFont);
		IndexLabel.setBounds(0,620,1000,100);
		IndexImage.setBorder(border);
		IndexImage.setBounds(0,685,348,55);
		IndexCaption.setFont(CaptionFont);
		IndexCaption.setBounds(0,700,1000,100);

		isEmptyLabel.setFont(LabelFont);
		isEmptyLabel.setBounds(0,730, 1000,100);
		isEmptyImage.setBorder(border);
		isEmptyImage.setBounds(0,795,350,44);
		isEmptyCaption.setFont(CaptionFont);
		isEmptyCaption.setBounds(0,800,1000,100);

		UnderstandingCheckTitle.setFont(LabelFont);
		UnderstandingCheckTitle.setBounds(600,260,1000,100);

		UnderstandingCheckQuestion.setFont(new Font("Ariel", Font.BOLD,14));
		UnderstandingCheckQuestion.setBounds(600,280,1000,100);
		UnderstandingCheckImage.setBorder(border);
		UnderstandingCheckImage.setBounds(600,340,356,116);

		ButtonOption1.setBounds(600,460,125,30);
		ButtonOption2.setBounds(600,490,125,30);
		ButtonOption3.setBounds(600,520,125,30);
		ButtonOption4.setBounds(600,550,125,30);

		SubmitButton.setBounds(600,590,100,30);
		Answer.setBounds(600,620,280,80);

		ContinueButton.setBounds(800,850,100,30);

		Section4Frame.add(SubmitButton);
		Section4Frame.add(Information45);
		Section4Frame.add(Information4Image);
		Section4Frame.add(Section4Title);
		Section4Frame.add(Information4);

		Section4Frame.add(AddLabel);
		Section4Frame.add(AddImage);
		Section4Frame.add(AddCaption);

		Section4Frame.add(GetLabel);
		Section4Frame.add(GetImage);
		Section4Frame.add(GetCaption);

		Section4Frame.add(ClearLabel);
		Section4Frame.add(ClearImage);
		Section4Frame.add(ClearCaption);

		Section4Frame.add(IndexLabel);
		Section4Frame.add(IndexImage);
		Section4Frame.add(IndexCaption);

		Section4Frame.add(isEmptyLabel);
		Section4Frame.add(isEmptyImage);
		Section4Frame.add(isEmptyCaption);

		Section4Frame.add(UnderstandingCheckTitle);
		Section4Frame.add(UnderstandingCheckQuestion);
		Section4Frame.add(UnderstandingCheckImage);

		Section4Frame.add(ButtonOption1);
		Section4Frame.add(ButtonOption2);
		Section4Frame.add(ButtonOption3);
		Section4Frame.add(ButtonOption4);
		Section4Frame.add(Answer);

		Section4Frame.add(ContinueButton);

	}


	//Static void method called WindowSetUp
	static void WindowSetUp(){

		//Setting up the Window so that it displays with a title, no layout, and a custom size.	
		Section4Frame.setLayout(null);
		Section4Frame.setTitle("ArrayLists");
		Section4Frame.setSize(1000,1000);
		Section4Frame.setVisible(true);

	}
}
