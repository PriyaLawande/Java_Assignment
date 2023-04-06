/*int[] a={12,14,2,26,35}   
find the difference b/w max and min values in array
output:35-2=33.*/
/*max value - min value=output of 33*/
package AssSet3;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		int a[] = { 12, 14, 2, 26, 35 };
		int max = 0, min = 0;

		Arrays.sort(a);		//arrays.sort method arrange order of array of array element.

		int diff = a[a.length - 1] - a[0];		//a[4]-a[0] = 35-2 = 33
		System.out.println(diff);
	}

}
