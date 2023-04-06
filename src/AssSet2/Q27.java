/*find the three consecutive characters in a string. if the string consists any three   
   consecutive characters return 1 else return -1
   like AAAxyzaaa will return true.*/
/*output=AAAxyzaaa=-1
 		abcdefg=1*/

package AssSet2;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input1 = sc.nextLine();
		int n = 0;
		for (int i = 0; i < input1.length() - 1; i++) {
			if (input1.charAt(i) == input1.charAt(i + 1))
				n++;
		}
		if (n <= 2)
			System.out.println("1");
		if (n > 2)
			System.out.println("-1");
	}

}
