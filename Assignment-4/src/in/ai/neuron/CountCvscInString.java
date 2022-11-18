package in.ai.neuron;

/**
 * 4. Program to count the number of consonants, 
 *	vowels, special characters in a String.
 * 
 * Methods responsible for counting consonants, vowels, special character and digits
 * 	countCVSInString(String CountCvscInString) : void
 * 
 */
public class CountCvscInString {

	public void countCVSInString(String CountCvscInString) {
		char character;
		int consonantCount = 0, vowelCount = 0, splChrCount = 0, digitCount = 0;

		for (int i = 0; i < CountCvscInString.length(); i++) {
				character = CountCvscInString.charAt(i);

			if (character >= 'A' && character <= 'Z' || 
					character >= 'a' && character <= 'z') {
				switch (character) {
				case 'A':
				case 'a':
				case 'E':
				case 'e':
				case 'I':
				case 'O':
				case 'o':
				case 'U':
				case 'u':
					vowelCount++;
					break;
				default:
					consonantCount++;

				}
			} else if (character >= '0' && character <= '9') {
				digitCount++;
			} else {
				splChrCount++;
			}
		}
		System.out.println("Number of Consonants,Vowels,Digits and " + 
		"Special_Characters present in the String: "+ CountCvscInString);
		System.out.println("Consonants:" + consonantCount + "\n" 
				+ "Vowels: " + vowelCount);
		System.out.println("Digits:" + digitCount + "\n" + "SpecialCharacters: " 
				+ splChrCount);
	}

	public static void main(String[] args) {

		CountCvscInString countCvsString = new CountCvscInString();

		String countCvsString1 = "GaGAN15@!#202";
		countCvsString.countCVSInString(countCvsString1);

	}
}
