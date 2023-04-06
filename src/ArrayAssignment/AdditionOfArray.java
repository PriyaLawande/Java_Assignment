/* Find the addition of two array elemnents({0,1,2} and  {3,4,5})*/
package ArrayAssignment;

import java.util.Scanner;

public class AdditionOfArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int array1[]= {0,1,2};
		int array2[]= {3,4,5};
		
		 System.out.print("Enter number of elements in first array: ");
		 for (int i=0; i<array1.length; i++) {
		       array1[i] = scan.nextInt();
		     }
		 
		 System.out.print("Enter number of elements in second array: ");
		    for (int i=0; i<array2.length; i++) {
			       array2[i] = scan.nextInt();
			     }
		    int resultarray[]=new int [array1.length];
		    System.out.println("The Output is:");
			 for(int i=0;i<array1.length;i++) 
			{	
				 resultarray[i]=array1[i]+array2[i];
				 System.out.println(resultarray[i]);
			} 

	}

}
