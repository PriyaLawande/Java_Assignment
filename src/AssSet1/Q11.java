/*11. Two input strings are accepted. If the two strings are of same length concat them and return, hell 
 if they are not of same length, reduce the longer string to size of smaller one, 
and concat them
input1:"hello"
input2:"hi" 
output:"lohi"
input1:"aaa"
input2:"bbb"
output:"aaabbb"*/
/*2hi length 1ch asel tr 1ch vary honar */

package AssSet1;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String input1 = sc.nextLine();
		System.out.println("enter second string");
		String input2 = sc.nextLine();

		if (input1.length() == input2.length()) {
			System.out.println(input1.concat(input2));
		} else {
			if (input1.length() > input2.length()) {
				int diff = input1.length() - input2.length();
				String result = input1.substring(diff, input1.length()) + input2;
				System.out.println(result);
			}
			if (input1.length() < input2.length()) {
				int diff = input2.length() - input1.length();
				String result = input2.substring(diff, input2.length()) + input1;
				System.out.println(result);
			}
		}

	}

}
