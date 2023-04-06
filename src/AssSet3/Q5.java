/*Given an array find the largest 'span'(span is the number of elements between two same digits)  
    find their sum.
    a[]={1,4,2,1,4,1,5}
    Largest span=5*/

package AssSet3;

public class Q5 {

	public static void main(String[] args) {
		
		int a[] = { 1, 4, 2, 1, 4, 1, 5 }; 
		int count = 0;
		int max = 0;
		int p=0,q=0;
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count = j;
				}
				if (count - i > max) {
					max = count - i;
					p=count;
					q=i;
				}
			}

		}
		System.out.println("Largest span between same number is:" +max);
		for(int k=q;k<=p;k++) {
			sum=sum+a[k];
		}
		System.out.println("sum between is:" +sum);
	}

}
