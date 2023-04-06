/*17.  Input a int array. Square the elements in even position and cube the elements in odd position and  
	add them as result.
input: {1,2,3,4}
output: 1^3+2^2+3^3+4^2*/ 
package AssSet1;

public class Q17 {

	public static void main(String[] args) {
		
		int[] input = { 1, 2, 3, 4 };
		int result1 = 0;
		int result2 = 0;
		
		 for (int i = 0; i < input.length; i++) {
			 if (i % 2 == 0) {
				 result1 = (input[i] * input[i] * input[i]) + result1;  // 1^3=1 2^2=4 3^3=27 4^2=16
			 }else {							
				 result2 = (input[i] * input[i]) + result2;				// 1+4+27+16= 48
			 }
		 }
		 int finalresult = result1 + result2;
		 System.out.println(finalresult);
	}

}
