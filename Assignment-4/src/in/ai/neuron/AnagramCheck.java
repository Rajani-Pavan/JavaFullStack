package in.ai.neuron;

/**
 * 5. Program to check given string is Anagram or not.
 * Defined methods are :
 * 	1. Method checks weather given strings are anagram or not :
 * 		isAnagram(String string1, String string2) : boolean
 * 
 * 	2. Method converts given string to uppercase : 
 * 		convertToUpperCase(string1) : char []
 * 
 * 	3. Methods sort the given string:
 * 		sortArrayByAlphabets(charArray1) : char []
 * 
 * 	4. Method converts given string into character array
 * 		char[] converToCharArray(String string)
 * 
 */
public class AnagramCheck {

	public boolean isAnagram(String string1, String string2) {

		char[] charArray1 = convertToUpperCase(string1);
		char[] charArray2 = convertToUpperCase(string2);
		boolean flag = false;

		charArray1 = sortArrayByAlphabets(charArray1);
		charArray2 = sortArrayByAlphabets(charArray2);

		for (int i = 0; i < charArray1.length; i++) {
			for (int j = 0; j < charArray2.length; j++) {
				if (charArray1[i] == charArray2[j]) {
					flag = true;
					break;

				} else {
					flag = false;
				}
			}
		}

		return flag;

	}

	public char[] sortArrayByAlphabets(char[] charArray) {

		char swap;
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 1; j < charArray.length - i; j++) {
				if (charArray[j] < charArray[j - 1]) {
					swap = charArray[j - 1];
					charArray[j - 1] = charArray[j];
					charArray[j] = swap;

				}
			}
		}
		return charArray;
	}

	public char[] convertToUpperCase(String string) {

		char[] charArray = converToCharArray(string);

		for (int i = 0; i < charArray.length; i++) {
				charArray[i] = (char) (charArray[i] - 32);
		}

		return charArray;
	}

	public char[] converToCharArray(String string) {
		char[] charArray = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			charArray[i] = string.charAt(i);
		}
		return charArray;
	}

	public static void main(String[] args) {
		String string1 = "Race";
		String string2 = "cAre";
		AnagramCheck anagramCheck = new AnagramCheck();
		if (anagramCheck.isAnagram(string1, string2)) {
			System.out.println(string1 + " and " + string2 + " are Anagram");
		} else {
			System.out.println(string1 + " and " + string2 + " are not an Anagram");
		}

	}

}
