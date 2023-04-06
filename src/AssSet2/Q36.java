/*compare two strings, if the characters in string 1 are present in 
   string 2, then it should be put as such in output, else '+' should be
   put in output...ignore case difference.
    input 1:"New York"
    input 2:"NWYR"
    output:N+w+Y+r+*/
package AssSet2;

public class Q36 {

	public static void main(String[] args) {
		String s1 = "New York";
		String s2 = "NWYR";

		String s3 = s1.toUpperCase();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s3.length(); j++) {
				if (s2.charAt(i) == s3.charAt(j)) {
					sb.append(s1.charAt(j)).append('+');
				}
			}
		}
		 System.out.println(sb.toString());
	}
}