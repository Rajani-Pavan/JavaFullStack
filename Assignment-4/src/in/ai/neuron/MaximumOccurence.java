package in.ai.neuron;

/**
 * 
 * 8. Program to find the maximum occurring character in a String.
 * 
 * 	method to check maximum occurrence of character:
 * 		maximumOccuringCharacter(String string) : char
 * 
 * @author rajani
 *
 */
public class MaximumOccurence {
	public static char maximumOccuringCharacter(String string) {
		int max = 0, count = 1;
		char character = ' ';

		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {
					count++;
				}
			}
			if (max < count) {
				max = count;
				character = string.charAt(i);
			}
			count = 1;
		}
		return character;
	}

	public static void main(String[] args) {

		String string = "rajaniiii";
		System.out.println("Maximum occuring character in the string "
		+string+" is "+maximumOccuringCharacter(string.toLowerCase()));

	}
}
