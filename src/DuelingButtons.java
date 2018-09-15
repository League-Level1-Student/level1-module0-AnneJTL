/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons { //implements ActionListener {
	
	public static void main(String[] args) {
		new DuelingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);

		// 2. Make the frame visible
		frame.setVisible(true);

		// 3. Set the text of the leftButton to "Click me!"
		leftButton.setText("Click me!");
		leftButton.setPreferredSize(SMALL);

		// 4. Set the text of the rightButton to "Click me!"
		rightButton.setText("Click me!");
		rightButton.setPreferredSize(SMALL);

		// 5. Add an action listener to the leftButton
		leftButton.addActionListener(new monActionListener());

		// 6. Add an action listener to the rightButton
		rightButton.addActionListener(new monActionListener());

		// 7. Add the leftButton to the panel
		panel.add(leftButton);

		// 8. Add the rightButton to the panel
		panel.add(rightButton);

		// 9. Pack the frame
		frame.pack();

		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");

	}

	class monActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JButton buttonPressed = (JButton) arg0.getSource();
			
			 //If the buttonPressed was the leftButton....
				// Set the text of the rightButton to "No, click Me!"
				// Set the PREFERRED size of the rightButton to BIG
				// Set the text of the leftButton to "Click Me!"
				// Set the PREFERRED size of the leftButton to SMALL
			if (buttonPressed == leftButton){
				leftButton.setText("Click Me!");
				leftButton.setPreferredSize(SMALL);
				rightButton.setText("No, click Me!");
				rightButton.setPreferredSize(BIG);
			}  
			
			 //If the buttonPressed was the rightButton, do the opposite. 
			else {
				rightButton.setText("Click Me!");
				rightButton.setPreferredSize(SMALL);
				leftButton.setText("No, click Me!");
				leftButton.setPreferredSize(BIG);
			}

			frame.pack();
		}
		
	}
/*	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		
		 If the buttonPressed was the leftButton....
			// Set the text of the rightButton to "No, click Me!"
			// Set the PREFERRED size of the rightButton to BIG
			// Set the text of the leftButton to "Click Me!"
			// Set the PREFERRED size of the leftButton to SMALL
		
		
		 If the buttonPressed was the rightButton, do the opposite. 
		

		frame.pack();
	}*/
}


