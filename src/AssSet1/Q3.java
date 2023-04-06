/*A integer array is given as input. find the difference between each element. Return the index of 
 the largest element which has the largest difference gap.
input: {2,3,4,2,3}
logic: 2-3=1,3-4=1,4-2=2,2-3=1
2 is the max diff between 4 and 2,return the index of 4 i.e 2
output:2*/ 

package AssSet1;

public class Q3 {

	public static void main(String[] args) {
		
		int[] input = { 2, 3, 4, 2, 3 };
		int difference, result = 0;
		for (int i = 0; i < input.length - 1; i++) { 			//   n2>n3
			difference = Math.abs(input[i] - input[i + 1]); 	// i=0 2-3=1  1>0  n3=1 n4=1
			if (difference > result) { 							// i=1 3-4=1  1>1  cond not satisfy
				result = difference; 							// i=2 4-2=2  2>1  n3=2 n4=3
			} 													// i=3 2-3=1  1>2  cond not satisfy
		}
		System.out.println(result);
	}

}
