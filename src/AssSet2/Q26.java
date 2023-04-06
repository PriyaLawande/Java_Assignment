/*26. validate the ip address in the form a.b.c.d*/
package AssSet2;

import java.util.StringTokenizer;

public class Q26 {

	public static void main(String[] args) {
		
		String str = "108.10.140.16";

		StringTokenizer stk = new StringTokenizer(str, ".");
		int a = Integer.parseInt(stk.nextToken());
		int b = Integer.parseInt(stk.nextToken());
		int c = Integer.parseInt(stk.nextToken());
		int d = Integer.parseInt(stk.nextToken());

		if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255) && (c >= 0 && c <= 255) && (c >= 0 && c <= 255)
				&& (d >= 0 && d <= 255)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}
}