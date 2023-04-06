/*1.A number is given as input. Find the odd digits in the number, add them and   
find if the sum is odd or not.
 if even return -1, if odd return 1*/

package AssSet1;

public class Q1 {

	public static void main(String[] args) {
		int a[] = { 5, 2, 3, 1, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) { 	// 0<5- true, 1<5- true, 2<5-true, 3<5-true, 4<5-true            
			if (a[i] % 2 != 0) { 				// 5%2=1!=0, 2%2=0==0, 3%2=1!=0, 1%2= 1!=0, 5%2=1!=0
				System.out.print(" " + a[i]);
				sum = sum + a[i];				 // 0+5=5, 5+3=8, 8+1=9, 9+5=14
			}
		}
		System.out.println(sum);
		if (sum % 2 == 0) { 					// 14%2=0==0
			System.out.println(-1);
		} else {
			System.out.println(1);
		}

	}
}
