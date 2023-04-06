/*5.Sum of fibonaaci series upto given input.  
sum of first 3 
logic:1+1+2
output:4*/
/*perv value + current value=new value
  0,1,1,2,3,5,8,13,21,34,55*/
/*o/p=1 0 6 0*/ 
package AssSet1;
import java.util.Scanner; 

public class Q5 {

	  public static void main(String[] args) {
		  
		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Value");
	        int a = sc.nextInt(); // a=1
	        int b = sc.nextInt(); // b=0
	        int count = sc.nextInt(); // count=3
	        int sum = sc.nextInt(); // sum=0
	        
	        for (int i = 0; i < count; i++) {
	        	int c = a + b;             // a=1, b=0, c=1
	            System.out.print(c + " "); // a=0, b=1, c=1
	            a = b;                     // a=1, b=1, c=2
	            b = c;                     // a=1, b=2, c=3
	            sum = sum + c;             // a=2, b=3, c=5     
	                                       // a=3, b=5, c=8
	        }
	        System.out.println(" ");
	        System.out.println("Sum Of Fibonacci series List: ");
	        System.out.print(sum + " ");
	    }
}
