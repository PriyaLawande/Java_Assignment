/*Find the sum of the numbers in the given input string array  
   Input{“2AA”,”12”,”ABC”,”c1a”)
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such
   i.e,it must be considered as 1,2*/

package AssSet3;

public class Q17 {

	public static void main(String[] args) {
		String input[] = { "2AA", "12", "ABC", "c1a" };
		int sum = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length(); j++) { 	// this for loop taken to iterate over individual string
				String s2 = input[i]; 						// string at every index in input array have to stored into new string
				char c = s2.charAt(j); 						// because we can not print it directly or can not use anywhere
				if (Character.isDigit(c)) {
					String s3 = String.valueOf(c);
					int d = Integer.parseInt(s3);
					sum = sum + d;
				}

			}

		}
		System.out.println(sum);
	}
}
