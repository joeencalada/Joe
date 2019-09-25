/**
 * 
 * @author Joe
 *  
 **/
import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {
		double budget = 99.99;
		double ticketCost = 1.45;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Lottogame is a lotto game for you to play");
		System.out.printf("You have a budget to spend of $%.2f to spend%n", budget);
			
		System.out.println("Would you like to play?");
		String answer = in.next();
		while(answer.equalsIgnoreCase("yes")) {
			if(budget>=ticketCost)
				budget = budget - ticketCost;
			else {
				System.out.println("Not enough money, Go Make money and come back");
				break;
			}
			System.out.println("Awesome, Would you like to play again? yes/no");
			answer=in.next();
		}
		
		
	}
}
