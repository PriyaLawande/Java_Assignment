/*String a="a very fine day"
output:A Very Fine Day*/
package AssSet3;

import java.util.StringTokenizer;

public class Q12 {

	public static void main(String[] args) {

		String a = "its a very fine day";
		
		StringBuffer sb = new StringBuffer();
		StringTokenizer t = new StringTokenizer(a, " ");
		
		while (t.hasMoreTokens()) { 
			
			String s2 = t.nextToken(); 								//t=a very fine day
			
			String s3 = s2.substring(0, 1); 						//s2= a very fine day
				
			String s4 = s2.substring(1, s2.length()); 				// s4=a v f d
			
			sb.append(s3.toUpperCase()).append(s4).append(" ");		// sb=A Very Fine Day
		}
		System.out.println(sb.toString());
	}

}
