/*Take the word with a max length in the given sentance 
 in that check for vowels if so count the no.of occurances !
  Input 1="Bhavane is a good girl"
  Output =3
  Input 1="Bhavanee is a good girl"
  Output =4*/

package AssSet3;

import java.util.StringTokenizer;

public class Q13 {

	public static void main(String[] args) {
		String input = "Bhavane is a good girl";
		int count = 0, max = 0;
		String vowel = "AEIOUaeiou";
		String s2 = new String();
		StringTokenizer t = new StringTokenizer(input, " ");
		while (t.hasMoreTokens()) {
			String s1 = t.nextToken();
			int n = s1.length();
			if (n > max) {
				max = n;
				s2 = s1;
			}
		}
		for (int i = 0; i < s2.length(); i++)
			for (int j = 0; j < vowel.length(); j++)
				if (s2.charAt(i) == vowel.charAt(j))
					count++;
		System.out.println(count);
	}
}
