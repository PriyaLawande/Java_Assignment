/*25. find the average of the maximum and minimum number in an integer array*/ 
package AssSet2;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float average=0;
		System.out.println("Enter a array size:");
		int arrLength=sc.nextInt();
		System.out.println("Enter a array elements:");
		int array[]=new int[50];
		for(int i=0;i<arrLength; i++) {
			array[i]=sc.nextInt();
		}
		int min;
		int max=min=array[0];
		
		for(int i=1;i<array[i];i++) {
			if(array[i]>max) {
				 max= array[i];
			}else if(array[i]<min) {
				min=array[i];
			}
		}
		average=(float)(max+min)/2; 		/*4( 1 2 3 4) max+min/2 4+1=5/2=2.5 */
		System.out.println(average);
	}

}
