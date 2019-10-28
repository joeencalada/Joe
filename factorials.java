/**
 * 
 * @author Joe
 *
 */
import java.util.Scanner;
public class factorials {
 public static void main(String[] args) {
	 int i, Number;
	 int Factorial = 1;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please Enter any number to find factorials: ");
	 Number = input.nextInt();
	 
	 for (i = 1; i<= Number; i++) {
		 Factorial = Factorial * i;
		
	 }
	 System.out.format("\nFactorial of %d = %d\n", Number, Factorial);
 }
}
