package in.ai.neuron;
/**
 * 6. Program to check weather given string is PANAGRAM or not
 * 
 *	UserDefined methods:
 * 
 *	1.Method to check given string is Panagram or not
 *		isPanagram(String panagram) : boolean
 *
 *	2.Method converts given string to Uppercase : 
 *		convertToUpperCase(String string) : String
 *
 *	3.Method converts given string into character array
 *		converToCharArray(String string) : char[] 
 *
 *	4.Method converts given string into string array
 *		convertToStringArray(String string): String[] 
 * 
 */

public class PanagramString {

	public boolean isPanagram(String panagram) {

		int[] alphaArray = new int[26];
		int index = 0;
		boolean flag = false;

		String string = new String();
		string = convertToUpperCase(panagram);
		for (int i = 0; i < string.length(); i++) {
			index = string.charAt(i) - 65;
			alphaArray[index] = index + 1;
			index++;
		}

		for (int i = 0; i < alphaArray.length; i++) {
			if (alphaArray[i] > 0) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public String convertToUpperCase(String string) {

		String[] stringArray = convertToStringArray(string);
		String str = new String();
		String str1 = new String();

		for (int i = 0; i < stringArray.length; i++) {
			str += stringArray[i];

		}
		char[] ch = converToCharArray(str);
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] - 32) >= 65 && (ch[i] - 32) <= 90) {
				ch[i] = (char) (ch[i] - 32);
				str1 += ch[i];
			} else {
				str1 += ch[i];
			}
		}
		return str1;
	}

	public char[] converToCharArray(String string) {
		char[] charArray = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			charArray[i] = string.charAt(i);
		}
		return charArray;
	}

	public String[] convertToStringArray(String string) {

		String[] stringArray = new String[string.length()];
		stringArray = string.split(" ");

		return stringArray;
	}

	public static void main(String[] args) {
		String panagram = "A quick brown fox jumps over the lazy dog";
		PanagramString checkForPanagram = new PanagramString();

		if (checkForPanagram.isPanagram(panagram)) {
			System.out.println(panagram + ": is panagram");
		} else {
			System.out.println(panagram + ": not a panagram");
		}
	}
}
