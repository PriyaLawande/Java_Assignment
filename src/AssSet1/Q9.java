/*9. find the max length-word in a given string and return the max-length word.  
if two words are of same length return the first occuring word of max-length
input:"hello how are you aaaaa"
output:hello(length-5)*/

package AssSet1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		sentence = sentence + " ";
		String word = "";
		String largestword = "";
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (c != ' ') {
				word = word + c;
			} else {
				if (word.length() > largestword.length())
					largestword = word;
				word = "";
			}

		}
		System.out.println("largest word is " + largestword + " length is " + largestword.length());
	}
}
