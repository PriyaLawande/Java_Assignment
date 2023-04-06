/*Return the number of days in a month, where month and year are given as input.
 input=5/2023
 output= 31*/
package AssSet2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input in month/year format");
		String s1 = sc.next();

		StringTokenizer stk = new StringTokenizer(s1, "/");
		int month = Integer.parseInt(stk.nextToken());
		int year = Integer.parseInt(stk.nextToken());

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("no of days in given input month are: 31");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("no of days in given input month are: 30");
		}
		if (month == 2) {
			if (year % 2 == 0) {
				System.out.println("no of days in given input month are:-29");

			} else {
				System.out.println("no of days in given input month are:-28");
			}
		}

	}

}
