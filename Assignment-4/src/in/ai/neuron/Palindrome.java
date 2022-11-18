package in.ai.neuron;

/**
 * 3. Program to check if “2552” is palindrome or not.
 *		method to check palindrome :
 *			isPalindrome(String paliString) : boolean
 */

public class Palindrome {
	
	public boolean isPalindrome(String paliString) {

		String string = new String("");

		for (int i = paliString.length() - 1; i >= 0; i--) {
			string += paliString.charAt(i);
		}
		if (string.equals(paliString)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		String paliString = "2552";
		if (palindrome.isPalindrome(paliString)) {
			System.out.println(paliString + " is palindrome");
		} else {
			System.out.println(paliString + " is not palindrome");
		}
	}

	

}
