/**
 * 2. Program to print duplicate characters in a given string
 * 
 * Method responsible to find duplicate characters in a given string
 * 	findDuplicates(String string) : void
 */
package in.ai.neuron;

public class DuplicatesInString {
	
	private static void findDuplicates(String string) {

		char[] duplicateCharArray = new char[string.length()];
		int index = 0;
		string = string.toUpperCase();
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
					if (string.charAt(i) == string.charAt(j))	{
							duplicateCharArray [index] = string.charAt(i);
							index++;
							break;
				}
		}
			
	}
		System.out.println("Duplicate characters present in the string: ");
		for (int i=0;i < index; i++)
			 if (duplicateCharArray[i] != duplicateCharArray[i+1])
				 System.out.print(duplicateCharArray[i]+" ");
	}

	public static void main(String[] args) {

		String string = new String("RAjjjani");
		findDuplicates(string);

	}
}
