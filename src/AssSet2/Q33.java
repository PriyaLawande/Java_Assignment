/* Retrieve the odd-position digits from input integer array. Multiply them with their index and
 return their sum.*/
package AssSet2;

public class Q33 {

	public static void main(String[] args) {
					// { 0, 1, 2, 3, 4, 5}  // take odd position input and multiply by index
		int input[] = { 7, 4, 3, 2, 5, 6 }; 
		int c;
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			 if (i % 2 != 0) {
				 c = input[i] * i;   // 7*0=0 1*4=4 3*2=6 5*6=30
				 sum = sum + c;		// 0+4+6+30=40
			 }
		}
		System.out.println(sum);
	}

}
