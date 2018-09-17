
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CutenessTV implements MouseListener {
	JFrame fenetre;
	JPanel ecran;
	JButton bouton1;
	JButton bouton2;
	JButton bouton3;
	JLabel nomVideo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CutenessTV();
	}
	
	public CutenessTV() {
		prepareGUI();
	}
	 
	private void prepareGUI() {
		fenetre = new JFrame();
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ecran = new JPanel();
		fenetre.add(ecran);
		
		bouton1 = new JButton("Video Ducks");
		bouton1.addMouseListener(this);
		bouton2 = new JButton("Video Frog");
		bouton2.addMouseListener(this);
		bouton3 = new JButton("Video Unicorns");
		bouton3.addMouseListener(this);
		
		ecran.add(bouton1);
		ecran.add(bouton2);
		ecran.add(bouton3);
		
		nomVideo = new JLabel("Dernière vidéo");
		ecran.add(nomVideo);

		fenetre.pack();
		fenetre.setVisible(true);
		
	}

	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JButton boutonAppuye = (JButton) arg0.getSource();
		
		if (boutonAppuye == bouton1){
			showDucks();
			nomVideo.setText("Video Duck");
		} else if (boutonAppuye == bouton2){
			showFrog();
			nomVideo.setText("Video Frog");
		} else {
			showFluffyUnicorns();
			nomVideo.setText("Video Unicors");
		}  
		
	}
	
	

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
