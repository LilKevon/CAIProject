//package
package GUI;

//imports
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.DefaultEditorKit.CopyAction;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

//Public class QuizWindow
public class QuizWindow {
	
	//Java Swing Components
	static Font QuestionFont = new Font("Arial", Font.BOLD, 13);
	static Font QuestionTitleFont = new Font("Arial", Font.BOLD, 20);
	
	static JFrame QuizFrame = new JFrame();
	static JLabel QuizTitle = new JLabel("Arrays Test");
	static JLabel QuizIntro = new JLabel("<html>Now that you have completed your Learning on Arrays, you will now do a test to see if you have completely grasped your understanding."
			+ "<br> Start whenever you want, and click submit when your finished!");
	
	static JLabel Question1Title = new JLabel("Question 1");
	static JLabel Question1Question = new JLabel("What are Arrays?");
	static JRadioButton Question1Option1 = new JRadioButton("Objects that can store elements of different data types");
	static JRadioButton Question1Option2 = new JRadioButton("Objects that can store elements of the same data type");
	static JRadioButton Question1Option3 = new JRadioButton("I don't know, what ARE Arrays?");
	static ButtonGroup Question1 = new ButtonGroup();
	
	static JLabel Question2Title = new JLabel("Question 2");
	static JLabel Question2Question = new JLabel("If an Array was created with length 4, what would be the array index?");
	static JRadioButton Question2Option1 = new JRadioButton("0 1 2 3");
	static JRadioButton Question2Option2 = new JRadioButton("1 2 3 4");
	static JRadioButton Question2Option3 = new JRadioButton("4 3 2 1");
	static ButtonGroup Question2 = new ButtonGroup();
	
	static JLabel Question3Title = new JLabel("Question 3");
	static JLabel Question3Question = new JLabel("What would this program output?");
	static JLabel Question3Image = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java22.PNG"));
	static JRadioButton Question3Option1 = new JRadioButton("7");
	static JRadioButton Question3Option2 = new JRadioButton("4");
	static JRadioButton Question3Option3 = new JRadioButton("5");
	static ButtonGroup Question3 = new ButtonGroup();
	
	static JLabel Question4Title = new JLabel("Question 4");
	static JLabel Question4Question = new JLabel("What will this program output?");
	static JLabel Question4Image = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java23.PNG"));
	static JRadioButton Question4Option1 = new JRadioButton("happy 5");
	static JRadioButton Question4Option2 = new JRadioButton("2");
	static JRadioButton Question4Option3 = new JRadioButton("happy happy 5");
	static ButtonGroup Question4 = new ButtonGroup();
	
	static JLabel Question5Title = new JLabel("Question 5");
	static JLabel Question5Question = new JLabel("Arrays are immutable, meaning...");
	static JRadioButton Question5Option1 = new JRadioButton("Their length can sometimes be changed.");
	static JRadioButton Question5Option2 = new JRadioButton("Their length cannot be changed");
	static JRadioButton Question5Option3 = new JRadioButton("Their length can always be changed");
	static ButtonGroup Question5 = new ButtonGroup();
	
	static JLabel Question6Title = new JLabel("Question 6");
	static JLabel Question6Question = new JLabel("What does this program output?");
	static JLabel Question6Image = new JLabel(new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java24.PNG"));
	static JRadioButton Question6Option1 = new JRadioButton("false false");
	static JRadioButton Question6Option2 = new JRadioButton("true true ");
	static JRadioButton Question6Option3 = new JRadioButton("false true");
	static ButtonGroup Question6 = new ButtonGroup();
	
	static JLabel Question7Title = new JLabel("Question 7");
	static JLabel Question7Question = new JLabel("What is the main difference between Arrays and ArrayLists?");
	static JRadioButton Question7Option1 = new JRadioButton("Arrays cannot store different data types, ArrayLists can.");
	static JRadioButton Question7Option2 = new JRadioButton("Array lengths are unchangable, ArrayLists can be.");
	static JRadioButton Question7Option3 = new JRadioButton("There is no difference.");
	static ButtonGroup Question7 = new ButtonGroup();
	
	 static ImageIcon Picture = (new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Check.png"));
	 static Image scaleImage = Picture.getImage().getScaledInstance(150, 100,Image.SCALE_DEFAULT);
	 static ImageIcon Correct = new ImageIcon(scaleImage);
	 
	 static ImageIcon Picture1 = (new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Cross.png"));
	 static Image scaleImage1 = Picture1.getImage().getScaledInstance(150, 100,Image.SCALE_DEFAULT);
	 static ImageIcon Wrong = new ImageIcon(scaleImage1);
	 
	 static JButton SubmitButton = new JButton("Submit");
	 
	 static int NumberofCorrect = 0;
	 static JLabel Mark = new JLabel("/" + 7);
	 static JButton BackButton = new JButton("Back");
	 
	 
	JLabel[]QuestionLabels = {Question1Question,Question2Question,Question3Question,Question4Question,Question5Question,Question6Question,Question7Question};
	JLabel[]Labels = {Question1Title,Question2Title,Question3Title,Question4Title,Question5Title,Question6Title,Question7Title};
	JLabel[]LabelImages = {Question3Image, Question4Image, Question6Image};
	
	
	
	//Public constructor
	public QuizWindow() {
		
		//Calling WindowSetup, FillWindows, AddButtonGroup, and QuizStart
		WindowSetUp();
		FillWindows();
		AddButtonGroup();
		QuizStart();
		
		//BackButton ActionListener. This is to go back to the SelectionWindow with all of the sections completed.
		BackButton.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e ) {
				
				//Call a new SelectionWindow with parameter(100).
				new SelectionWindow(100);
				
				//Dispose of current QuizFrame
				QuizFrame.dispose();
			}
		});
		
		//Set the DefaultCloseOperation to EXIT_ON_CLOSE
		QuizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//SubmitButton ActionListener. This is to show the results of the test, labelling each answer as right and wrong.
		SubmitButton.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Start the quiz check by setting the NumberofCorrect to 0. 
				NumberofCorrect=0;
				
				//These all check if the right option was selected for each question. If so, the questiontitle with be green. If not, the questiontitle is red.
				if(Question1Option2.isSelected()) {
					Question1Title.setForeground(Color.GREEN);
					NumberofCorrect++;
				}
				else Question1Title.setForeground(Color.RED);
				
				if(Question2Option1.isSelected()) {Question2Title.setForeground(Color.GREEN);
				NumberofCorrect++;
				}
				else Question2Title.setForeground(Color.RED);
				
				if(Question3Option3.isSelected()) { Question3Title.setForeground(Color.GREEN);
				NumberofCorrect++;
				}
				else Question3Title.setForeground(Color.RED);
				
				if(Question4Option3.isSelected()) {Question4Title.setForeground(Color.GREEN);
				NumberofCorrect++;
				}
				else Question4Title.setForeground(Color.RED);
				
				if(Question5Option2.isSelected()) {Question5Title.setForeground(Color.GREEN);
				NumberofCorrect++;
				}
				else Question5Title.setForeground(Color.RED);
				
				if(Question6Option1.isSelected()) {Question6Title.setForeground(Color.GREEN);
				NumberofCorrect++;
				}
				else Question6Title.setForeground(Color.RED);
				
				if(Question7Option2.isSelected()) { Question7Title.setForeground(Color.GREEN);
				NumberofCorrect++;
				}
				else Question7Title.setForeground(Color.RED);
				
				
			//Set JLabel Mark to the NumberofCorrect + "/7". This will show the correct mark for the user during that test.
			 Mark.setText(NumberofCorrect + "/7");
			 
			 //Set bounds to BackButton.
			 BackButton.setBounds(800,750,100,30);
			 QuizFrame.add(BackButton);
			 
			 
			}
			
		
		});
		
	}
	
	//void method FillWindows. This is to fill the window with Java Components.
	void FillWindows() {
		
		
		//Set Fonts and Bounds to all of the TextJLabels.
		QuizTitle.setFont(QuestionTitleFont);
		QuizTitle.setBounds(0,-20,1000,100);
		
		QuizIntro.setFont(new Font("Arial", Font.BOLD, 13));
		QuizIntro.setBounds(0,20,1000,100);
		
		Mark.setFont(new Font("Arial", Font.BOLD,30));
		Mark.setBounds(700,840,50,50);
		
		//Add all Java Swing Components to QuizFrame.
		QuizFrame.add(Mark);
		QuizFrame.add(QuizTitle);
		QuizFrame.add(QuizIntro);
		
		
		
	}
	
	//void method called AddButtonGroup
	void AddButtonGroup() {
		
		//This is to add all options to their respective questions. 
		//This is in order to deny multiple buttons being selected in the same button group.
		Question1.add(Question1Option1);
		Question1.add(Question1Option2);
		Question1.add(Question1Option3);
		

		Question2.add(Question2Option1);
		Question2.add(Question2Option2);
		Question2.add(Question2Option3);
		
		Question3.add(Question3Option1);
		Question3.add(Question3Option2);
		Question3.add(Question3Option3);
		
		Question4.add(Question4Option1);
		Question4.add(Question4Option2);
		Question4.add(Question4Option3);
		
		Question5.add(Question5Option1);
		Question5.add(Question5Option2);
		Question5.add(Question5Option3);
		
		Question6.add(Question6Option1);
		Question6.add(Question6Option2);
		Question6.add(Question6Option3);
		
		Question7.add(Question7Option1);
		Question7.add(Question7Option2);
		Question7.add(Question7Option3);
		
		
		

		
		
	}
	
	//void WindowSetUp Method. Set ups the Frame.
	void WindowSetUp() {
		
		QuizFrame.setTitle("Quiz!");
		QuizFrame.setSize(1000,1000);
		QuizFrame.setLayout(null);
		QuizFrame.setVisible(true);
		
	}
	
	//Void QuizStart method
	void QuizStart() {
		
		//Setting fonts to all of the QuestionsTitles
		for(int i =0; i<Labels.length; i++) {
			Labels[i].setFont(QuestionTitleFont);
		}
		
		//Setting fonts to all of the QuestionCaptions
		for(int i = 0; i<QuestionLabels.length; i++) {
			QuestionLabels[i].setFont(QuestionFont);
		}
		
		//Putting borders on all of the Images
		for(int i =0; i<LabelImages.length; i++) {
			Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
			LabelImages[i].setBorder(border);
		}
		
		//Setting the bounds for all of the questionTitles, Questions, and JRadioButtons
		Question1Title.setBounds(5,130,200,50);
		Question1Question.setBounds(5,100,200,150);
		Question1Option1.setBounds(5,185,400,30);
		Question1Option2.setBounds(5,215,400,30);
		Question1Option3.setBounds(5,245,400,30);
		
		Question2Title.setBounds(5,270,200,50);
		Question2Question.setBounds(5,240,600,150);
		Question2Option1.setBounds(5,325,400,30);
		Question2Option2.setBounds(5,355,400,30);
		Question2Option3.setBounds(5,385,400,30);
		
		Question3Title.setBounds(5,420,200,50);
		Question3Question.setBounds(5,390,600,150);
		Question3Image.setBounds(5,480,201,61);
		Question3Option1.setBounds(5,550,400,30);
		Question3Option2.setBounds(5,580,400,30);
		Question3Option3.setBounds(5,610,400,30);
		
		Question4Title.setBounds(5,660,200,50);
		Question4Question.setBounds(5,630,600,150);
		Question4Image.setBounds(5,720,269,114);
		Question4Option1.setBounds(5,840,400,30);
		Question4Option2.setBounds(5,870,400,30);
		Question4Option3.setBounds(5,900,400,30);
		
		Question5Title.setBounds(570,130,200,50);
		Question5Question.setBounds(570,100,220,150);
		Question5Option1.setBounds(570,185,400,30);
		Question5Option2.setBounds(570,215,400,30);
		Question5Option3.setBounds(570,245,400,30);
		
		Question6Title.setBounds(570,270,200,50);
		Question6Question.setBounds(570,240,600,150);
		Question6Image.setBounds(570,339,398,76);
		Question6Option1.setBounds(570,430,400,30);
		Question6Option2.setBounds(570,460,400,30);
		Question6Option3.setBounds(570,490,400,30);
		
		Question7Title.setBounds(570,520,200,50);
		Question7Question.setBounds(570,490,400,150);
		Question7Option1.setBounds(570,580,400,30);
		Question7Option2.setBounds(570,610,400,30);
		Question7Option3.setBounds(570,640,400,30);
		
		QuizFrame.add(Question7Title);
		QuizFrame.add(Question7Question);
		QuizFrame.add(Question7Option1);
		QuizFrame.add(Question7Option2);
		QuizFrame.add(Question7Option3);
		
		QuizFrame.add(Question6Title);
		QuizFrame.add(Question6Question);
		QuizFrame.add(Question6Image);
		QuizFrame.add(Question6Option1);
		QuizFrame.add(Question6Option2);
		QuizFrame.add(Question6Option3);
		
		
		QuizFrame.add(Question5Title);
		QuizFrame.add(Question5Question);
		QuizFrame.add(Question5Option1);
		QuizFrame.add(Question5Option2);
		QuizFrame.add(Question5Option3);
		
		QuizFrame.add(Question4Title);
		QuizFrame.add(Question4Question);
		QuizFrame.add(Question4Image);
		QuizFrame.add(Question4Option1);
		QuizFrame.add(Question4Option2);
		QuizFrame.add(Question4Option3);
		
		
		QuizFrame.add(Question3Title);
		QuizFrame.add(Question3Question);
		QuizFrame.add(Question3Image);
		QuizFrame.add(Question3Option1);
		QuizFrame.add(Question3Option2);
		QuizFrame.add(Question3Option3);
		
		QuizFrame.add(Question2Title);
		QuizFrame.add(Question2Question);
		QuizFrame.add(Question2Option1);
		QuizFrame.add(Question2Option2);
		QuizFrame.add(Question2Option3);
		
		
		
		QuizFrame.add(Question1Title);
		QuizFrame.add(Question1Question);
		QuizFrame.add(Question1Option1);
		QuizFrame.add(Question1Option2);
		QuizFrame.add(Question1Option3);
		

		//Setting bounds to the SubmitButton
		SubmitButton.setBounds(800,850,100,30);
		QuizFrame.add(SubmitButton);
		
		
		
	}
	
	
	
	
}
