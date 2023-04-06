/*Retrieve the elements in a array, which is an input, which are greater than a specific input number.   
 Add them and find the reverse of the sum.*/ 
package AssSet2;

public class Q35 {

	public static void main(String[] args) {
		
		int input[] = { 11, 40, 78, 65, 26, 39, 91 };
		int num = 45, sum = 0;                    
		for (int i = 0; i < input.length; i++) {
			if (input[i] > num) {
				sum = sum + input[i];
			}
		}
		System.out.println("Sum of numbers more than specific input number is " + sum);
		int reverse = 0;
		while (sum != 0) {
			reverse = reverse * 10 + sum % 10; // 78+65+91=234
												//1st iter= 4, 2nd iter= 43, 3rd iter= 432
			sum = sum / 10;
		}
		System.out.println("Reverse of sum is " + reverse);
	}

}
