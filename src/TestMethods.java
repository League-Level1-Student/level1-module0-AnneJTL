
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
	}
	
	// 5
	public static void repeat(String display, int times){
		for (int i=0; i <= times; i++) {
			System.out.print(display + " ");
		}
		System.out.print("\n");
	}
	
	// 4
	public static void echo(String twice){
		System.out.println(twice + " " + twice);
	}
	
	// 3
	public static void truth(String name){
		String myFavoriteSinger = "Rob Thomas";
		System.out.println(name + ((name.equals(myFavoriteSinger)) ? " is awesome." : " is annoying."));
	}
	
	// 2
	public static void rocker(String name){
		System.out.println(name + " rocks");
	}
	
	// 1
	public static void weRock(){
		System.out.println("The League rocks");
	}

}
