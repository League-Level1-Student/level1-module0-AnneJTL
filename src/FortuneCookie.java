import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FortuneCookie {
	JFrame window;
	JButton buttonFortuneCookie;
	
	public FortuneCookie(){
		window = new JFrame();
		buttonFortuneCookie = new JButton("Cliquer ici");		
	}
	
	public void initGUI(){
		buttonFortuneCookie.setPreferredSize(new Dimension(300,100));
		buttonFortuneCookie.addActionListener(new MyListener());
		
		window.add(buttonFortuneCookie);
		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FortuneCookie fortuneCookie = new FortuneCookie();
		fortuneCookie.initGUI();
		//fortuneCookie.showButton();

	}
	
	public void showButton() {
		
		int random = new Random().nextInt(5);
		
		switch (random){
		case 0:
			JOptionPane.showMessageDialog(window, "Fortune Cookie #1");
			break;
		case 1:
			JOptionPane.showMessageDialog(window, "Fortune Cookie #2");
			break;
		case 2:
			JOptionPane.showMessageDialog(window, "Fortune Cookie #3");
			break;
		case 3:
			JOptionPane.showMessageDialog(window, "Fortune Cookie #4");
			break;
		case 4:
			JOptionPane.showMessageDialog(window, "Fortune Cookie #5");
			break;
		default:
			JOptionPane.showMessageDialog(window, "Bizarre, Bizarre !!!");
			break;
		}
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			showButton();

			
		}
		
	}

}
