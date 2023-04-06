/*Given array of intergers,print the sum of elements sqaring/cubing as per the power of their indices.           
//answer=  sum=sum+a[i]^i;
     eg:input:{2,3,5}
    Output:29*/

package AssSet3;

public class Q2 {

	public static void main(String[] args) {

		int input[] = { 2, 3, 5 };
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum = (int) (sum + Math.pow(input[i], i)); // Math.pow is method from math class in which
		}												// you can give no in first arg, power in second arg of method. 
		System.out.println(sum);

	}

}
/*2^0=1
 * 3^1=3
 * 5^2=25
 * output= 1+3+25=29*/