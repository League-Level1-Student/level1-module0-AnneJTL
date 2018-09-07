
public class TestMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. Write a method to support the code below, that prints "The League rocks" when it is called.
		weRock();

		// 2. Write a method to support the code below, that takes a name as a parameter and prints that they rock.
		rocker("Bob");
		
		// 3. Write a method to support the code below, that takes a name as a parameter 
		// and adds " is awesome" if the name is your favorite singer, but " is annoying " if it is someone else.
		truth("Rob Thomas"); //prints "Rob Thomas is awesome"
		truth("Justin Bieber"); //prints "Justin Bieber is annoying"

		//4. Write a method to support the code below, that takes a word as a parameter and prints it twice.
		echo("hello"); //prints "hello hello"
		
		// 5. Write a method to support the code below, that takes a word and a number as parameters and prints the word a number of times.
		repeat("mayday", 4); //prints "mayday mayday mayday mayday"
		
		// 6. Write a method to support the code below that returns the name of the best programmer.
		String theBest = getTheBestCoder();
		System.out.println("6. The best coder: " + theBest);
		
		//7. Write a method to support the code below that adds 2 whole numbers and returns the result.
		int sum = add(2,2);
		System.out.println("7. Sum: " + sum); //prints 4
		
		//8. Write a method that works out whether a given number is odd or not.
		int number = 4;
		if (isOddNumber(number))
			System.out.println("8. " + number + " is an odd number");
		else
			System.out.println("8. " + number + " is NOT an odd number");
		
		// Test ou exclusif
		boolean a = true, b = true;
		System.out.println("Test Ou Exclusif: " + testOuExclusif(a, b)+ " pour a = " + a + " et b = " + b);

	}
	
	//9.
	public static boolean testOuExclusif(boolean a, boolean b) {
		return (a^b);
	}
	
	//8.
	public static boolean isOddNumber(int number){
		if (!((number % 2) == 0))
			return true;
		else 
			return false;
	}
	
	// 7.
	public static int add(int x, int y) {
		return x + y;
	}
	
	// 6.
	public static String getTheBestCoder() {
		return("Of course, it's me!");
	}
	
	
	// 5.
	public static void repeat(String display, int times){
		System.out.println("5. Repeat.");
		for (int i=0; i <= times; i++) {
			System.out.print(display + " ");
		}
		System.out.print("\n");
	}
	
	// 4.
	public static void echo(String twice){
		System.out.println("4. twice: " + twice + " " + twice);
	}
	
	// 3.
	public static void truth(String name){
		String myFavoriteSinger = "Rob Thomas";
		System.out.println("3. truth: " + name + ((name.equals(myFavoriteSinger)) ? " is awesome." : " is annoying."));
	}
	
	// 2.
	public static void rocker(String name){
		System.out.println("2. Rocker: " + name + " rocks");
	}
	
	// 1.
	public static void weRock(){
		System.out.println("1. The League rocks");
	}

}
