//package
package GUI;

//Imports
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;
import javax.swing.border.Border;

//public class Section2Window
public class Section2Window  {
	
	//Java Swing Components(Order: JFrame, JLabel, JRadioButton, ButtonGroup, Check your Understanding Java Components)
	static  JFrame Section2Frame = new JFrame();

	static int Done = 0;
	
	static JLabel Section2Title = new JLabel("Creating an Array");
	
	static JLabel Information2 = new JLabel("<html>In this section, you will learn how to create a Array. <br>"
			+ "Arrays are created using one of the 2 following prompts; A default declaration, and an instance declaration: Here they are below:"
			+ "<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>" 
			+ "1. defines a array with a general declaration. We have data type followed with [] and variable name. We then use a equal sign, and the keyword new."
			+ "<br> new is the keyword that defines a new object. We use this to tell Java that we want to make a new reference to an array. <br> "
			+ "finally, we end off with data type again, and a [] refering to the length of the array. Remember, a array of size 10 will include indexes 0-9."
			+ "<br><br>2. defines a int array with the default declaration. "
			+ "<br><br>3. defines a int array with instances already declared. Notice how instead of a 'new int' declaration, we specify what elements are in the array. Keep in mind that 0-index still applies."
			+ "<br><br>4. defines an int array with mutltiple dimensions. Multiple dimension arrays can be viewed as our diagram before: a line of lockers. However, you can start adding dimensions."
			+ "<br> for example, a 2d([][]) Can be viewed as adding multiple rows of lockers to our original row."
			+ "<br><br>"
			+ "Some things to note when creating an array using the default declaration:"
			+ "<br>-Remember that an array can only hold one type of data. As such, the data type at the start, and the data type in the 'new' declaration should be the same. Not doing so will cause a error.(0.3)"
			+ "<br>-You have to declare a size. Not doing so will cause an compiling error.(0.4)"
			+ "<br>-Array names have the exact same limitations as variable names."
			+ "<br>"
			+ "<br>Some things to note when creating an array using the instance declaration."
			+ "<br>-Remember that you do not need to declare a size. The amount of elements inside will predetermine the length for you."
			+ "<br>-Remember that Arrays can only hold one type of data. You cannot add different data type elements into the same array. ");
	
	static JLabel Information25Title = new JLabel("General vs Instance?");
	
	static JLabel Information25 = new JLabel("<html>So when do we use the general declaration vs the instance declaration?"
			+ "<br>We use the instance declaration when we know what we want to put in the array. For example, if we know we want to add 1,2,3 into the array, we would use the instance declaration."
			+ "<br>We use the general declaration when we don't know whats going to be in the array. For example, if a user was to input the elements they wanted in the array, we would use the default "
			+ "<br>declaration, since we can't predefine the elements anymore."
			+"<br> In the next section you will learn how to use/manipulate arrays.");
	
	
	
	
	
	static JLabel Information2ImageCaption = new JLabel("Figure 0.2: Creating an array using different types of declarations.");
	
	static JLabel Information2Image = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java6.PNG"));
	
	static JLabel Information2Image2 = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java5.PNG"));
	
	static JLabel Information2ImageCaption2 = new JLabel("Figure 0.3/0.4: Possible errors when creating an Array.");
	
	
	static JLabel UnderstandingCheckCaption = new JLabel("Check your Understanding!");

	static JLabel UnderstandingCheckQuestion = new JLabel("Which is the right way to create a int array using the default declaration?");

	//ButtonGroup Note: Use ButtonGroup in order to tie all three option buttons together. This is to make sure only one button can be pressed at the same time.
	static JRadioButton ButtonOption1 = new JRadioButton("A. double[] anArray = new String[];");
	static JRadioButton ButtonOption2 = new JRadioButton("B. int[] myArray = new int[2];");
	static JRadioButton ButtonOption3 = new JRadioButton("C. String[] myArray = new String[];");
	static ButtonGroup Understanding = new ButtonGroup();

	//Buttons for submitting your answer and continuing to the next frame.
	static JButton SubmitButton = new JButton("Submit");

	static JButton ContinueButton = new JButton("Continue");

	//The answer, correct or incorrect, that is invisible for when there is no answer yet.
	static JLabel Answer = new JLabel("");

	//Public Constructor
	public Section2Window() {
		
		//Call all three methods that the public class has.
		WindowSetUp();
		FillWindows();
		AddButtonGroup();
	}
	
	
	//A static method called AddButtonGroup of type void. This will add all three of our buttons into the ButtonGroup, to ensure that we don't press more then one button at one time.
	static void AddButtonGroup() {
		
		Understanding.add(ButtonOption1);
		Understanding.add(ButtonOption2);
		Understanding.add(ButtonOption3);
		
	}
	
	//A static method called FillWindows of type void. This will add all of our Swing Components to our JFrame.
	static void FillWindows(){
		
		//Create an border for all images, set the color as BLUE, and the thickness as 5.
		Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
		
		//Setting fonts and bounds for all of the Text JLabels, and setting bounds for all of the Image JLabels.
		Section2Title.setFont(new Font("Ariel", Font.BOLD, 25));
		Section2Title.setBounds(5,-20,1000,100);
		
		Information2.setFont(new Font("Ariel", Font.BOLD, 12));
		Information2.setBounds(5,5,1000,700);
		
		
		Information2Image.setBorder(border);
		Information2Image.setBounds(0,100,471,193);
		
		Information2ImageCaption.setFont(new Font("Ariel", Font.ITALIC, 12 ));
		Information2ImageCaption.setBounds(0, 250, 1000,100);
		
		Information2Image2.setBorder(border);
		Information2Image2.setBounds(650,135,310,97);
		
		Information2ImageCaption2.setFont(new Font("Ariel", Font.ITALIC, 12 ));
		Information2ImageCaption2.setBounds(650, 190, 310,97);
		
		Information25Title.setFont(new Font("Ariel", Font.BOLD, 19));
		Information25Title.setBounds(5,620,1000,100);
		
		Information25.setFont(new Font("Ariel", Font.BOLD, 12));
		Information25.setBounds(5, 470, 2000,500);

		UnderstandingCheckCaption.setFont(new Font("Ariel", Font.BOLD, 15));
		UnderstandingCheckCaption.setBounds(13,750,1000,100);

		UnderstandingCheckQuestion.setFont(new Font("Ariel", Font.BOLD, 14));
		UnderstandingCheckQuestion.setBounds(13,780, 1000,100);

		//Setting bounds for all of the JRadioButtons
		ButtonOption1.setBounds(13,850 ,300,30);
		ButtonOption2.setBounds(13,880,300,30);
		ButtonOption3.setBounds(13,910,300,30);
		SubmitButton.setBounds(13,950, 100,30);
		
		//Setting bounds to the invisible text
		Answer.setBounds(140,955,450,12);

		ContinueButton.setBounds(800,960,100,30);


		//Adding all of the Swing Components to the Section2Frame
		Section2Frame.add(Answer);
		Section2Frame.add(ContinueButton); 
		Section2Frame.add(SubmitButton);
		Section2Frame.add(ButtonOption1);
		Section2Frame.add(ButtonOption2);
		Section2Frame.add(ButtonOption3);
		Section2Frame.add(Information25Title);
		Section2Frame.add(Information25);
		Section2Frame.add(UnderstandingCheckQuestion);
		Section2Frame.add(UnderstandingCheckCaption);
		Section2Frame.add(Information2ImageCaption2);
		Section2Frame.add(Information2Image2);
		Section2Frame.add(Information2ImageCaption);
		Section2Frame.add(Section2Title);
		Section2Frame.add(Information2Image);
		Section2Frame.add(Information2);
		
		//Adding an ActionListener for SubmitButton. Submit Button has to output whether the radio Button selected was correct or not.
		SubmitButton.addActionListener(new ActionListener() {
			
			//Overriding actionPerformed, in order to do something when the action is fired.
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Create a string called isCorrect with "none" stored. This will change depending on which Button is selected.
				String isCorrect = "none";
				
				//Checking algorithm to see which button is selected. If the Option2 Button is selected, isCorrect is "yes". Otherwise, isSelected is no1 or no2 depending on which wrong JRadioButton was selected.
				if(ButtonOption1.isSelected()) isCorrect = "no1";
				else if(ButtonOption2.isSelected()) isCorrect = "yes";
				else if(ButtonOption3.isSelected()) isCorrect = "no2"; 

				//Checking if the answer was right or wrong, and if it was wrong, then which wrong radio button was selected.
				if(isCorrect.equals("yes")) {
					Answer.setText("Correct! Option B is correct. int[] myArray = new int[2]; is without error.");
					Done = 50;
				}
				
				else if(isCorrect.equals("no1")) {
					Answer.setText("Sorry... Incorrect. This option used 2 different data types for the array.");
					
				}
				
				else if(isCorrect.equals("no2")) {
					Answer.setText("Sorry... Incorrect. This option didn't specify what the array length is.");
				}
				
			}

			
		});//End of SubmitButton ActionListener
		
		//Add an ActionListener for ContinueButton. ContinueButton has to display the next window when selected, and dispose of the current window.
		ContinueButton.addActionListener(new ActionListener() {
			
			//Overriding actionPerformed method
			@Override
			public void actionPerformed(ActionEvent e) {
			
			//Creating a new instance of SelectionWindow, with int arguement 50.
			 new SelectionWindow(Done);
			 
			 	//Dispose of the current Section2Frame
				Section2Frame.dispose();
			}
		});//ContinueButton ActionListener end
		
		//Setting the DefaultCloseOperation to Dispose on Close, so that the application fully closes when pressing the X Button.
		Section2Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);;
		
	}
	
	
	//static method called "WindowSetUp" of type void. This will do the regular setup for Section2Frame.
	static void WindowSetUp() {
		
		//Setting Layout to null
		Section2Frame.setLayout(null);
		
		//Setting size to 1055, 1050.
		Section2Frame.setSize(1055,1050);
		
		//Setting title to "Creating an Array"
		Section2Frame.setTitle("Creating an Array");
		
		//Setting visibility to true.
		Section2Frame.setVisible(true);   
		
	}
	

}
