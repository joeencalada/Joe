/**
 * 
 * @author Joe
 *
 */
import java.util.Scanner;

public class CarDealer {
	public static void main(String[] args) {
		String answer;
		int creditScore, age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello I'm a car dealer,\ndo you want to buy a car?");
		answer = input.next();
		
		if(answer.equalsIgnoreCase("Yes")) {
			System.out.println("OK, let me show you what I have...");
			System.out.println("Wait, what's your age?");
			age = input.nextInt();
			if(age>=25) {
				System.out.println("OK, good");
				System.out.println("What model do you want");
				String answer1 = input.next();
				checkModel(answer1);
			}else {
				System.out.println("Sorry, I cannot sell yout the car");
			}
		}else {
			System.out.println("OK, come back when you are ready");
		}}
		public static void checkModel(String model) {
			switch(model) {
			case "Ferrari_488GTB":
				System.out.println("$202,723.00");
				break;
			case "2018_Ferrari_California":
				System.out.println();
				break;
				case "Lambo_Urus":
					System.out.println("That's $200,000.00");
					break;
					default:
						System.out.println("Please Come back later, they're out of stock");
			}
		}
	}


