
//packages
package GUI;

//imports
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

//Public Class Scope Start
public class ActivityWindow {

	//Java Swing Components(Order: JFrames, JLabels, JButton, JTextArea) 
	static JFrame ActivityFrame = new JFrame();

	static JLabel ChallengeTitle = new JLabel("Array Challenge!");
	static JLabel Challenge = new JLabel("<html>Here is the Activity! Create an program that adds 7,8,9,10 to an ArrayList called MyArrayList, and checks if the ArrayList is empty. "
			+ "<br> Then, create an Array with {5,7,1,10,9,7,3} called MyArray. Sort the Array, use a for loop to find the index of 1, if found, then output 'Found' <br>and finally output the length.");
	static JLabel Answer = new JLabel("");

	static JButton SubmitButton = new JButton("Submit");
	static JButton TestButton = new JButton("Test!");

	//JTextArea Note: JTextArea allows for multiline inputs from the user. This is different from JTextField, which doesn't allow multiline inputs. JTextField would not be able to simulate a coding session aswell as JTextArea.
	static JTextArea CodeField = new JTextArea("import java.util.Arrays; \nimport java.util.ArrayList;\n\n public class Solution{ \n\n public static void main(String[]args){ \n\n\n\n\n\n\n\n\n     } \n }");

	//Public constructor
	public ActivityWindow() {
		

		
		//Calling WindowSetUp and FillWindows
		WindowSetUp();
		FillWindows();

		//Creating a SubmitButton ActionListener. SubmitButton should get the Text in the JTextArea and trim and replace all whitespace with nothing. This is so that we can compare the code decently efficiently with a pre set code solution. The syntax and grammer have to be percise.
		//However, there is alot more leniency with whitespace, as the trim and replaceAll replaces all whitespace with nothing, leaving us with one line of code. 
		SubmitButton.addActionListener(new ActionListener() {

			//actionPerformed overridden
			@Override
			public void actionPerformed(ActionEvent e) {

				//Create a variable called text of type String. Store the text gotten from CodeField, and replace all of the whitespace with blank.
				String text = CodeField.getText().replaceAll("\\s+", "");

				//trim the entire line of text, removing trailing or leading whitespace.
				text = text.trim();

				//Call the textChecker method with arugment (text).
				textChecker(text);
			}

		});//SubmitButton ActionListener scope end

		//TestButton ActionListener. TestButton is to open a test window while disposing of the previous window.
		TestButton.addActionListener(new ActionListener() {

			//actionPerformed overridden
			@Override
			public void actionPerformed(ActionEvent e) {

				//Calling a new instance of QuizWindow.
				new QuizWindow();

				//Disposing of current ActivityFrame.
				ActivityFrame.dispose();
			}

		});//TestButton ActionListener scope end
	}

	//Create a method of type void called "textChecker" with parameter String text. This is to check whether the code inputted into the JTextArea is the same as a the pre set code.
	void textChecker(String text) {

		//If the text is equal to the text that was predefined(A valid code already tested), then set Answer as a correct declaration and cause the TestButton to open.
		if(text.equals("importjava.util.Arrays;importjava.util.ArrayList;publicclassSolution{publicstaticvoidmain(String[]args){ArrayList<Integer>MyArrayList=newArrayList<>();MyArrayList.add(7);MyArrayList.add(8);MyArrayList.add(9);MyArrayList.add(10);System.out.println(MyArrayList.isEmpty());int[]MyArray={5,7,1,10,9,7,3};Arrays.sort(MyArray);for(inti=0;i<MyArray.length;i++){if(MyArray[i]==1){System.out.println(\"Found\");}}System.out.println(MyArray.length);}}"
				+ "")) {
			Answer.setText("Congratulations! You completed the activity! Press the test button to start your test!");
			TestButton.setVisible(true);

			
		}

		//Otherwise, check 3 different edge cases. If the user forgot to use ArrayList, if the user forgot to use proper names for the variables, and if the code doesn't contain a for loop. Otherwise, just check syntax.
		else {
			if(!text.contains("ArrayList<Integer>")) {
				Answer.setText("Incorrect... Did you forget <> for the ArrayList?");
				TestButton.setVisible(false);
			}

			else if(!text.contains("MyArray") || !text.contains("MyArrayList")) {
				Answer.setText("Incorrect... Are you missing your Array names or your Array names are wrong?");
				TestButton.setVisible(false);
			}

			else if(!text.contains("for")) {
				Answer.setText("Incorrect... Are you missing a for loop?");
				TestButton.setVisible(false);
			}

			else {
				Answer.setText("Incorrect... Check Syntax and Try Again!");
				TestButton.setVisible(false);
			}
		}




	}

	//Void FillWindows method. This is a basic method that just fills the current window with Java Swing Components defined above.
	void FillWindows() {

		//Setting Fonts and Bounds for all Text JLabels, setting Bounds for Buttons. Adding them all to ActivityFrame.
		SubmitButton.setBounds(650,900,100,30);
		ActivityFrame.add(SubmitButton);

		ChallengeTitle.setFont(new Font("Arial", Font.BOLD, 18));
		ChallengeTitle.setBounds(0,-20,1000,100);
		ActivityFrame.add(ChallengeTitle);

		CodeField.setBounds(100,150,700,700);
		ActivityFrame.add(CodeField);

		Challenge.setFont(new Font("Arial", Font.BOLD, 15));
		Challenge.setBounds(0,30,1000,100);
		ActivityFrame.add(Challenge);

		Answer.setFont(new Font("Arial", Font.BOLD, 15));
		Answer.setBounds(15,865,1000,100);
		ActivityFrame.add(Answer);

		TestButton.setBounds(800,900,100,30);
		ActivityFrame.add(TestButton);
		TestButton.setVisible(false);
	}

	//void WindowSetUp method
	void WindowSetUp() {
		//Set size to 1000,1000
		ActivityFrame.setSize(1000,1000);
		
		//Set layout to null
		ActivityFrame.setLayout(null);
		
		//Set title to Arrays Activity
		ActivityFrame.setTitle("Arrays Activity");
		
		//Set Visible to true.
		ActivityFrame.setVisible(true);
	}


}
