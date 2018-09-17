import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SoundEffectMachine implements MouseListener {
	JFrame fenetre;
	JPanel ecran;
	JButton bouton1;
	JButton bouton2;
	JButton bouton3;
	JLabel nomMusique;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoundEffectMachine sounds = new SoundEffectMachine();
	}
	
	public SoundEffectMachine() {
		prepareGUI();
	}
	 
	private void prepareGUI() {
		fenetre = new JFrame();
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ecran = new JPanel();
		fenetre.add(ecran);
		
		bouton1 = new JButton("Musique 1");
		bouton1.addMouseListener(this);
		bouton2 = new JButton("Musique 2");
		bouton2.addMouseListener(this);
		bouton3 = new JButton("Musique 3");
		bouton3.addMouseListener(this);
		
		ecran.add(bouton1);
		ecran.add(bouton2);
		ecran.add(bouton3);
		
		nomMusique = new JLabel("Musique jouée");
		ecran.add(nomMusique);

		fenetre.pack();
		fenetre.setVisible(true);
		
	}

	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JButton boutonAppuye = (JButton) arg0.getSource();
		
		if (boutonAppuye == bouton1){
			playSound("cymbal.wav");
			nomMusique.setText("Musique 1");
		} else if (boutonAppuye == bouton2){
			playSound("homer-woohoo.wav");
			nomMusique.setText("Musique 2");
		} else {
			playSound("sawing-wood-daniel_simon.wav");
			nomMusique.setText("Musique 3");
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
