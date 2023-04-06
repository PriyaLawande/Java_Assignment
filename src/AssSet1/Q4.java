/*4.Given two arrays list. retrieve the odd position elements form first input and even   
position elements from second list. 
put it into the new array list at the same positions from where they are retrieved from.
(consider 0th position as even position, and two lists are of same size)
input1:{12,1,32,3} // odd
input2:{0,12,2,23} // even position
output:{0,1,2,3}*/ // odd+even 

package AssSet1;

public class Q4 {

	public static void main(String args[]) {

		int a[] = { 12, 1, 32, 3 };
		int b[] = { 0, 12, 2, 23 };
		int c[] = new int[4];
		int i;
		for (i = 0; i < a.length; i++) {
			if (i % 2 == 0)
				c[i] = b[i];
			if (i % 2 != 0)
				c[i] = a[i];
			System.out.print(c[i] + ",");
		}
	}
}
