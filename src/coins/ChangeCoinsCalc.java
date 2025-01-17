package coins;
import java.util.Scanner;

public class ChangeCoinsCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello, welcome to the change calculator app.");
		String choice;
		do 
		{
			int centNum = -1;
			while(centNum < 0 || centNum > 99)
				{
			System.out.print("\nPlease enter an integer 0-99 for the amount of cents you wish to calculate: ");
			centNum = scanner.nextInt();
			if (centNum >= 0 && centNum <= 99) 
			{
				break; //its valid, leave
			}
			else 
			{
				System.out.println("Please enter a valid integer between 0 and 99.");
			}
			}
			
			//define coins
			
			int quarters = centNum / 25;
			centNum %= 25; 
			
			int dimes = centNum / 10;
			centNum %= 10;
			
			int nickels = centNum / 5;
			centNum %= 5;
			
			int pennies = centNum; //remainder is pennies
			
			
			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes: " + dimes);
			System.out.println("Nickels: " + nickels);
			System.out.println("Pennies: " + pennies);
			
			System.out.print("Would you like to go again? (y/n): ");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
	}

}
