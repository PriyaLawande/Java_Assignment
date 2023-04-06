/*Given an array int a[]. Add the sum at even indexes.do the same with odd indexes. 
    if both the sum is equal return 1 or return -1.*/

package AssSet3;

public class Q15 {

	public static void main(String[] args) {
		int a[]= {1,1,3,3};				// {0,1,2,3}= 1+3=4 1+3=4 
												
		int sum=0,sum1=0;
		
		for (int i=0;i<a.length;i++) {
			if(i%2==0) {
				
				sum=sum+a[i];
			}else {
				
				sum1=sum1+a[i];
			}
		}
		if(sum==sum1) 
			System.out.println("1");
		else 
			System.out.println("-1");
		
	}

}
