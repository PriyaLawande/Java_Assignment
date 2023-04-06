/*16. Find if a given pattern appears in both the input strings at same postions.
input1: "hh--ww--"
input2: "rt--er--"*/
package AssSet1;

public class Q16 {

	public static void main(String[] args) {
		
		String s1 = "hh--ww--";
		String s2 = "rt--ww--";
		boolean b=true;
		
		for (int i = 0; i < s1.length(); i++)
			if ((s1.charAt(i) == '-') || (s2.charAt(i) == '-'))
				 if (s1.charAt(i) != s2.charAt(i)) {
					 b = false;
				 }
		 if (b == true)
			 System.out.println("Same pattern");
		 else
			 System.out.println("Different pattern");
	}

}
