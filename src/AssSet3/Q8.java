/*count the number of times the second word in second string occurs in first string-case sensitive  
input1=hai hello hai where hai Hai;
input2=what hai
output=3;*/
package AssSet3;

import java.util.StringTokenizer;

public class Q8 {

	public static void main(String[] args) {
		String input1 = "hai hello how are you?? hai hai";
		String input2 = "what hai";

		int count = 0;

		StringTokenizer stk1 = new StringTokenizer(input2, " ");
		StringTokenizer stk2 = new StringTokenizer(input1, " ");
		String s1 = stk1.nextToken();
		String s2 = stk1.nextToken();

		while (stk2.hasMoreTokens()) {// true if and only if there is at least one token in the string after the
									// current position; false otherwise.
			
			if (stk2.nextToken().equals(s2))
				count++;
		}
		System.out.println(count);

	}

}
