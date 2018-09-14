/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz{
	static int score = 0;
	static int total = 0;

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		
        quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window
        
        //JPanel myPanel = new JPanel();

		// 1. find an image on the internet, and put its URL in a String variable 
        // (from your browser, right click on the image, and select "Copy Image Address"
        String imageURL = "https://fotomelia.com/wp-content/uploads/edd/2016/02/banque-d-images-gratuites-libre-de-droits-du-domaine-public-haute-d%C3%A9finition-19-1560x1112.jpg";
        //System.out.println("URL: " + imageURL);
        
		// 2. create a variable of type "Component" that will hold your image
        Component holdImage;
        

		// 3. use the "createImage()" method below to initialize your Component
        holdImage = createImage(imageURL);
        holdImage.setName("Coucher soleil");
        
        // 15. on rajoute un mouseMotionListener sur le composant "image"
        holdImage.addMouseMotionListener(new CustomListener(){});

        //System.out.println("HoldImage: " + holdImage.getName() + " - " + holdImage.toString());

		// 4. add the image to the quiz window
        quizWindow.add(holdImage);

		// 5. call the pack() method on the quiz window
        
        //quizWindow.add(myPanel);
        //myPanel.add(holdImage);
        quizWindow.pack();

		// 6. ask a question that relates to the image
        String reponse = JOptionPane.showInputDialog("Oui / Non : Il y a un tas de galets sur cette photo");

		// 7. print "CORRECT" if the user gave the right answer
        total++;
        if (reponse.equalsIgnoreCase("OUI")){
        	score++;
        	JOptionPane.showMessageDialog(null, "Bonne Réponse !!!\nVotre score est: " + score + " / " + total);
        }

		// 8. print "INCORRECT" if the answer is wrong
        else {
        	JOptionPane.showMessageDialog(null, "INCORRECT !!!\nVotre score est: " + score + " / " + total);
        }

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
        quizWindow.remove(holdImage);

		// 10. find another image and create it (might take more than one line of code)
        imageURL = "https://pixnio.com/free-images/2017/05/31/2017-05-31-10-42-42-900x602.jpg";
        holdImage = createImage(imageURL);
        holdImage.setName("Orca");

		// 11. add the second image to the quiz window
        quizWindow.add(holdImage);

		// 12. pack the quiz window
        quizWindow.pack();

		// 13. ask another question
        reponse = JOptionPane.showInputDialog("Oui / Non : Il y a un orque sur cette image");

		// 14+ check answer, say if correct or incorrect, etc.
        total++;
        if (reponse.equalsIgnoreCase("OUI")){
        	score++;

         JOptionPane.showMessageDialog(null, "BONNE REPONSE !!!\nVotre score est: "+ score + " / " + total);
        } else {
        	JOptionPane.showMessageDialog(null, "INCORRECT !!!\nVotre score est: " + score + " / " + total);
        }
        

        //addMouseMotionListener(null);
        
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz


}

// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
class CustomListener implements MouseMotionListener {
	  public void mouseMoved(MouseEvent me) {
	    System.out.println("mouseMoved");
	  }

	  public void mouseDragged(MouseEvent me) {
	    System.out.println("mouseDragged");
	  }
}



