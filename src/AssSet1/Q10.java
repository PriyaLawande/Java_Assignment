/* Get a input string. reverse it and parse it with '-'.
input:computer
output:r-e-t-u-p-m-o-c*/

package AssSet1;

public class Q10 {

	public static void main(String[] args) {
		 String str = "computer";
		 int j = 0;
		 char[] c = new char[2 * str.length()];
		 for (int i = str.length() - 1; i >= 0; i--) {
			 c[j] = str.charAt(i);
			 j++;
			 c[j] = '-';
			 j++;
		 }
		 for(int i=0;i<(2*str.length())-1;i++) {
			 System.out.print(" " + c[i]);
			 }
		 }
	}
		