/*13. Get a integer array as input. Find the average of the elements which are in the position of prime  index
input:{1,2,3,4,5,6,7,8,9,10}
logic:3+4+6+8(the indeces are prime numbers)
output:21*/

package AssSet1;

public class Q13 {

	public static void main(String[] args) {
			   // { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; /*take prime number position(2 3 5 7) */
		int b = 0;
		int sum = 0;
		String s = "";
		for (int i = 2; i < a.length; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)

					c++;
			}
			if (c == 2) {
				s += a[i];
				sum += a[i];
			}
		}
		System.out.println("Prime index elements are:" + s);
		System.out.println("Sum of elements is:" + sum);
	}
}
