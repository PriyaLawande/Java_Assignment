/*GIVEN A STRING 555-666-1234 
DISPLAY AS 55-56-661-234?*/
/*String manupulation*/
package AssSet2;

import java.util.StringTokenizer;

public class Q30 {

	public static void main(String[] args) {
		
		String s = "555-666-1234";

		StringTokenizer stk = new StringTokenizer(s, "-");
		String s1 = stk.nextToken();
		String s2 = stk.nextToken();
		String s3 = stk.nextToken();

		StringBuffer sb = new StringBuffer();
		sb.append(s1.substring(0, s1.length() - 1)).append('-');
		sb.append(s1.substring(2, s1.length())).append(s2.charAt(0)).append('-');
		sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-');
		sb.append(s3.substring(1, s3.length()));
		System.out.println(sb);
	}

}
