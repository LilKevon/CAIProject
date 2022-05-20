//package
package GUI;

//imports
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//public class StartWindow
public class StartWindow {

	//Swing Components
	static JFrame StartFrame = new JFrame();
	static JButton StartButton = new JButton("Start");
	static JButton HelpButton = new JButton("Help");
	static JButton ExitButton = new JButton("Exit");
	static JLabel TitleArrays = new JLabel("Java \n Arrays");
	static ImageIcon Picture = (new ImageIcon("C:\\Users\\16475\\eclipse-workspace\\CAI - Kevin Li\\src\\GUI\\Images\\Java2.jpg"));
	static Image scaleImage = Picture.getImage().getScaledInstance(190, 190,Image.SCALE_DEFAULT);
	static ImageIcon a = new ImageIcon(scaleImage);
	static JLabel IntroPic = new JLabel(a);


	//Constructor
	StartWindow(){
		
		//Call FillWindow and WindowSetUp
		FillWindow();
		WindowSetUp();

		//StartButton ActionListener, starts the main GUI.
		StartButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new SelectionWindow(0);

				StartFrame.dispose();

			}


		});

		//HelpButton ActionListener, starts the Help Window
		HelpButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new HelpFrame();
				StartFrame.dispose();

			}


		});

		//ExitButton addActionListener, Exits the GUI program.
		ExitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(StartFrame, "Thank you for using this application", "Thank you!", JOptionPane.INFORMATION_MESSAGE);

				System.exit(0);

			}
		});

		//Set DefaultCloseOperation to dispose on close.
		StartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


	}


	//void Method called FillWindow
	void FillWindow() {

		//Setting bounds and fonts for JLabel Components
		StartButton.setBounds(130,260,200,25);
		HelpButton.setBounds(130,295,200,25);
		ExitButton.setBounds(130,330,200,25);

		IntroPic.setBounds(130,60,200,200);	

		TitleArrays.setFont(new Font("Serif", Font.BOLD, 30));
		TitleArrays.setBounds(160,-50,200,200);

		StartFrame.add(StartButton);
		StartFrame.add(HelpButton);
		StartFrame.add(ExitButton);
		StartFrame.add(TitleArrays);
		StartFrame.add(IntroPic);

	}

	//void Method called WindowSetUp
	void WindowSetUp() {

		//Setting up the Window so that it displays with a title, no layout, and a custom size.
		StartFrame.setTitle("Java Arrays");
		StartFrame.setLayout(null);
		StartFrame.setSize(500,500);
		StartFrame.setVisible(true);

	}


}
