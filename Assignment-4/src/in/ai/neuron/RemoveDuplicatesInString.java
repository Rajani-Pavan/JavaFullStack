/**
 * 1. Program to remove duplicate characters in a given string
 * 
 * 	method responsible to remove duplicate characters in a given string
 * 		removeDuplicates(String string):void
*/

package in.ai.neuron;

public class RemoveDuplicatesInString {

	// method to remove duplicate characters in a given string

		public void removeDuplicates(String string) {

			char[] str = string.toCharArray();
			int i, j, index = 0;
			for (i = 0; i < str.length; i++) {
				for (j = 0; j < i; j++) {
					if (str[i] == str[j]) {
						break;
					}
				}
				if (j == i) {
					str[index++] = str[i];
				}
			}
			for (i = 0; i < index; i++) {
					System.out.print(str[i]);
			}
		}
	public static void main(String[] args) {

		String string = new String("inneeuurroooonnn");
		RemoveDuplicatesInString rdis = new RemoveDuplicatesInString();
		rdis.removeDuplicates(string);
	}
	
}