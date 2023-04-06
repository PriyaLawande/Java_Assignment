/*20. Get a input string. Find if it is a negative number, if true return the absolute value,  
in other cases return -1.
input: "-123"
output: 123
input: "@123"
output: -1*/
package AssSet1;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String input = sc.next();

		int n1 = 0;
		if (input.startsWith("-")) {
			int num = Integer.parseInt(input);
			if (num < 0)
				n1 = Math.abs(num);
		} else
			n1 = -1;
		System.out.println(n1);
	}

}
