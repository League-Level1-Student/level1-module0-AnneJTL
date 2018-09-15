/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java package,  
	// or if you prefer, get celebrity photos from the Internet, place them in the default
	// package, and change the names below.
	
	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	
	int score = 0;


	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		//int score = 0;

		// 2. Set the size of the window in the initializeGui() method below

		for (int i = 0; i < 4; i++) {
			boolean testAnswer = false;
			
			// 4. Ask the user who this person is and store their answer
			String guess = JOptionPane.showInputDialog("who is this?");
			
			// 5. Check their answer. If they guessed correctly:
			// -- Tell them they are right and increase the score by 1
			if (guess != null){
				if (i == 0){
					if (guess.equalsIgnoreCase("Arnold"))
						testAnswer = true;
						score += afficheResultat("Arnold", testAnswer);
										
				} else if (i == 1) {
					if (guess.equalsIgnoreCase("Leonardo"))
						testAnswer = true;
						score += afficheResultat("Leonardo", testAnswer);
										
				} else if (i == 2) {
					if (guess.equalsIgnoreCase("Morgan"))
						testAnswer = true;
						score += afficheResultat("Morgan", testAnswer);
											
				} else if (i == 3) {
					if (guess.equalsIgnoreCase("Jack"))
						testAnswer = true;

						score += afficheResultat("Jack", testAnswer);
					
				} else {
					testAnswer = false;

				}
				
			}

			// 6. Otherwise:
			// -- Tell them they are wrong and who the person is

			// 7. Use the showNextImage() method below to get the next image
			showNextImage();
		    // 8. Show them their current score
			JOptionPane.showMessageDialog(null, "Your score is: " + score);
			
			// 9. .... repeat for all your images.....

		}


	}
	
	private int afficheResultat(String acteur, boolean answer){
		if (answer) {
		System.out.println("You're right, the answer is: " + acteur);
		return 1;
		}
		else {
			System.out.println("You're wrong, the right answer is: " + acteur);
			return -1;
		}
	}

	public void showNextImage() {
		JLabel image = getNextImage();
		int tailleX = image.getIcon().getIconWidth();
		int tailleY = image.getIcon().getIconHeight();
		System.out.println("image:" + image.toString() + "\n\tx: " + tailleX + " - y:" + tailleY);
		panel.removeAll();
		panel.add(image);	


		window.setSize(tailleX+30,tailleY+50);
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		// 3. Change the size of the window so that you can only see part of the image.
		
		//window.setSize(400,400);	
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		
		System.out.println("BEFORE");

		JOptionPane.showMessageDialog(null, "Your final score is: " + score);
		System.out.println("AFTER");

		System.exit(0);
		return new JLabel();
	}
}
