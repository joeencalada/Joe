/**
 * 
 * @author Joe
 *
 */
import java.util.Scanner;
public class exam {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter The SMS Abbreviation: ");
		String abbreviation = scnr.nextLine();
		
		if (abbreviation.equalsIgnoreCase("LOL")) {
			String translation = "Laughing Out Loud";
		
		System.out.println(abbreviation + " means " + translation);
	} else if
		(abbreviation.equalsIgnoreCase("SMH")) {
			String translation = "Shaking My Head";
			
			System.out.println(abbreviation + " means " + translation);
		}else if
			 (abbreviation.equalsIgnoreCase("TMI")) {
				String translation = "Too Much Information";
				
				System.out.println(abbreviation + " means " + translation);
				
			} else
				System.out.println("Unknown abbreviation");
}
}
	