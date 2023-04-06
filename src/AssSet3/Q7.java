/*arraylist1={ 1,2,3,4,5}   
  arraylist2={ 6,7,8,9,10}
size of both list should be same 
output={6,2,8,4,10}*/

package AssSet3;
public class Q7 {

	public static void main(String[] args) {

		int input1[] = { 1, 2, 3, 4, 5 };
		int input2[] = { 6, 7, 8, 9, 10 };
		int c[] = new int[input1.length];   // c array taken to store new elements extracted from input1 &input2

		if (input1.length == input2.length)
			for (int i = 0; i < input1.length; i++) {
				if (i % 2 == 0) {
					c[i] = input2[i];
				} else {
					c[i] = input1[i];
				}
			}
		for (int a : c) {		// we can not print direct c,because it is an array,to print elements inside array
								// use for each loop to iterate over array c.
			System.out.print(a + ",");	
		}
	}

}
