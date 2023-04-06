/*find the no.of charcters,that has repeated 3 consecutive times  
input1:"aaabbccc"
ouput1=2;*/
package AssSet3;

public class Q9 {

	public static void main(String[] args) {

		String input = "aaabbccc";
		int noOfChar = 0;
		int count = 0;

		for (int i = 0; i < input.length() - 1; i++) {

			if (input.charAt(i) == input.charAt(i + 1))
				count++;
			else
				count = 0;

			if (count == 2)
				noOfChar++;

		}
		System.out.println(noOfChar);
	}

}
