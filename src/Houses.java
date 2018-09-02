import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot rob;
	public static final String SMALL_HEIGHT = "small";
	public static final String MEDIUM_HEIGHT = "medium";
	public static final String LARGE_HEIGHT = "large";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rob = new Robot();

		rob.setX(50);
		rob.setY(550);
		rob.setSpeed(100);
		rob.penDown();
		Random randomHeight = new Random();
		Random randomColorFloat = new Random();
		String height;
		int randomValue;
		boolean night= false;
		
		if (night){
			Robot.setWindowColor(Color.BLACK);
		}

		for (int i=0; i < 10; i++){
			randomValue = randomHeight.nextInt(3);
			float r = randomColorFloat.nextFloat();
			float g = randomColorFloat.nextFloat();
			float b = randomColorFloat.nextFloat();
			Color randomColor = new Color(r, g, b);
			
			if (randomValue == 0) 
				height = SMALL_HEIGHT;
			else if (randomValue == 1) 
				height = MEDIUM_HEIGHT;
			else 
				height = LARGE_HEIGHT;

			try {
				drawHouse(height, randomColor);
			} catch (IllegalArgumentException e){
				System.out.println("Argument incorrect");
			}
		}
	}

	public static void drawHouse(String height, Color couleur) throws IllegalArgumentException {
		int intHeight;
		if (height.equals(SMALL_HEIGHT))
			intHeight = 60;
		else if (height.equals(MEDIUM_HEIGHT))
			intHeight = 120;
		else if (height.equals(LARGE_HEIGHT))
			intHeight = 250;
		else {
			throw new IllegalArgumentException("La valeur -" + height
					+ "- est incorrecte");
		}
		rob.setPenColor(couleur);
		rob.move(intHeight);
		if (height.equals(LARGE_HEIGHT))
			drawFlatRoof();
		else
			drawPointyRoof();
		rob.move(intHeight);
		rob.setPenColor(Color.GREEN);
		rob.turn(-90);
		rob.move(20);
		rob.turn(-90);

	}
	
	public static void drawPointyRoof(){
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
		rob.turn(45);
	}
	
	public static void drawFlatRoof(){
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		
	}

}
