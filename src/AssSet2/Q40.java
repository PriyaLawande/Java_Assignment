/* Input1=845.69, output=3:2; 
    Input1=20.789; output=2:3;
    Input1=20.0; output=2:1;  
    output is in Hashmap format.
    Hint: count the no of digits.*/

package AssSet2;

import java.util.StringTokenizer;

public class Q40 {

	public static void main(String[] args) {

		double d = 845.69;
		int n1 = 0, n2 = 0;
		String s = String.valueOf(d);

		StringTokenizer stk = new StringTokenizer(s, ".");
		String s1 = stk.nextToken();
		String s2 = stk.nextToken();
		n1 = s1.length();
		n2 = s2.length();
		if (s1.charAt(0) == '0') 	// if string have zero(0) at charAt(0) position , its length always is 1
									// whatever zero written behind any number not considered into that no 
									// for e.g 020.45 is nothing but 20.45, no value for zero behind 20
			n1 = s1.length() - 1;
		if (n2 != 1)
			if (s2.charAt(s2.length() - 1) == '0')  // same here zero written after any number present after dot, zero
													// have no value
													// for e.g 20.030 is nothing but 20.03
				n2 = s2.length() - 1;
		String s3 = String.valueOf(n1) + ":" + String.valueOf(n2);
		System.out.println(s3);

	}

}