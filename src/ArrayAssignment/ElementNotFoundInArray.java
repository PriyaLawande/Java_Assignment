/* Search given number in an array. If number is present in an array then print number and array 
index of that no. If not, print "Element not found" message.
e.g Array={12,56,67,98}
given no:67 Print 67 and 2(Array index at which element is present)
*/

package ArrayAssignment;

import java.util.Scanner;

public class ElementNotFoundInArray {

	public static void main(String[] args) {
		
		int[] array = { 12, 56, 67, 98 };
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int element = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				index=i;
				System.out.println("Number present " + array[i] + " index is " + index);
				break;
			} else {
				System.out.println("Element not found:");
			}
		}
	}
}
