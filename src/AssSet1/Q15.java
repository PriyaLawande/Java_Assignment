/*15. Get two integer arrays as input. Find if there are common elements in the arrays.  
find the number of common elements.
input1: {1,2,3,4}
input2: {3,4,5,6}
output: 4(3,4,3,4)*/
package AssSet1;

public class Q15 {

	public static void main(String[] args) {
		
		int[] input1 = { 4, 5, 8, 9, 11, 15 };
		int[] input2 = { 3, 4, 11, 8 };
		int[] result;
		int c=0;
		for (int i = 0; i < input1.length; i++) {
			 for (int j = 0; j < input2.length; j++) {
				 if (input1[i] == input2[j]) {
					 c++;
					 System.out.println("Common elements are:" +input1[i]);
				 }
			 }
		}
			System.out.println("\"Total no of Common elements are:" +c);
	}

}
