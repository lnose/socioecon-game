import java.util.Scanner;

public class Storybook {
	
	private static double balance;
	
	public Storybook(double bal ){
		balance = bal;
	}
	
//	public static void clearScreen() {  
//		    //Clears Screen in java
//		System.out.print("\u000C");
//		} 

	public static void setBalance(double balance) {
		Storybook.balance = balance;
	}

	public static double getBalance(){
		return balance;
	}
	
	//SCANNER
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		String input = "";
		
	//title + welcome
	System.out.println("COULD YOU LAST THE WEEK WITH $25?" 
			+ "\na choose your own adventure story by Lillian Nose");
//	clearScreen();
	
	System.out.println("What is your name?: ");
	input = keyboard.nextLine();
	/*clearScreen();
	 * 
	 */
	
	System.out.println("CHAPTER ONE: ");
	System.out.println("------------");
	/*clearScreen();
	 * 
	 */
	//EVENT 1
	System.out.println("You, " + input + ", live on the outskirts of town in a run down appartment.");
	System.out.println("You live alone and have just been recently laid off from a blue collar job. You dropped out of high school to work to support "
			+ "your family");
	System.out.println("and have no further education. ");
	System.out.println("You now have the opportunity to move out, where are you thinking of?");
	System.out.println("A) Move to the City to a similar apartment"
			+ " B) Move to a larger house with 3 other roommates"
			+ " C) Stay in the same apartment with your family");
	input = keyboard.nextLine();
	
	//EVENT TWO 
	if(input.equalsIgnoreCase("A")){
		System.out.println("After much struggling, you have found an apartment of a slightly worse condition in the Bronx.");
		System.out.println("You now have to deal with the basics, where do you get your food from?");
		System.out.println("A)Welfare Pantry B)Fast Food C)Farmers Market");
		input = keyboard.nextLine();
			if(input.equalsIgnoreCase("A")){
				System.out.println("You have a limited supply, but you ultimately save money, You have saved $50");
				
		
	
		
	
	}
	
			
	
	

	
	
	
	}
	}
}
