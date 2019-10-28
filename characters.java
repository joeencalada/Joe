/*
 * author @Joe
 * 
 */
import java.util.Scanner;
public class characters {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Hello stranger, what's your name?");
	String name = input.nextLine();
	System.out.println("Hey " + name + ", what's the name of your favorite pet?");
	String petName = input.nextLine();
	System.out.println("That's a cool name");
	System.out.println(name + ", " + petName + " has " + petName.length() + " characters");
			
}
}
