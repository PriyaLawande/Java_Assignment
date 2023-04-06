/*Retrieve the max from array which is in a odd-index*/
package AssSet2;

public class Q29 {

	public static void main(String[] args) {

		int a[] = { 10, 16, 53, 49 };
		int max = 0;
		for (int i = 0; i <= (a.length - 1); i++) {
			if (i % 2 != 0) {
				if (max < a[i])
					max = a[i];
			}
		}
		System.out.println(max);
	}

}
