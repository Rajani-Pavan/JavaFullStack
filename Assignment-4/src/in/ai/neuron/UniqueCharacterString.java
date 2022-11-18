package in.ai.neuron;
import java.util.Scanner;
/**
 * 7. Program to check weather given String contains all the unique characters
 * 
 * method to given String contains all the unique characters:
 * 		isStringUnique(String string) : boolean
 */

public class UniqueCharacterString {

	private boolean isStringUnique(String string) {

		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		UniqueCharacterString uniqueCharacterString = new UniqueCharacterString();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input String:");
		String string = scan.nextLine();
		if (uniqueCharacterString.isStringUnique(string.toLowerCase())) {
			System.out.println("The String " + string + " :contains all unique characters");
		} else {
			System.out.println("The String " + string + " :contains duplicate characters");
		}
	}

}
