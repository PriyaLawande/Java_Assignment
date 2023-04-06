package ArrayAssignment;

import java.util.Scanner;

public class PrimeNumberUsingForLoop {

	public static void main(String[] args) {
	        int num;
	        System.out.println("Enter a number : ");
	        Scanner sc = new Scanner(System.in);
	        num = sc.nextInt();
	        int count = 0;
	        
	        for (int i = 2; i < num; i++) {
	        	if (num % i == 0) {
	                // flag = true;
	                count++;
	                break;
	            }
	        }
	        if (count == 0) {
	            System.out.println("Number is a prime number:");
	        } else {
	            System.out.println("Number is not a prime number!");
	        }
	    }
}
