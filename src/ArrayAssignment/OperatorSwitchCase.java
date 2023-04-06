/*Take input of two  numbers from user and take one operator(+,-,*,/) as a input from user and do manipulations 
    according to operator and display result on console.(Switch Case) */

package ArrayAssignment;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class OperatorSwitchCase {

	public static void main(String[] args) {

		char operator;
		int num1,num2,result;
		Scanner input=new Scanner(System.in);
		System.out.println("Choose an operator :+ ,-,*,/");
		operator=input.next().charAt(0);
		System.out.println("Enter first number:");
		num1=input.nextInt();
		System.out.println("Enter second number:");
		num2=input.nextInt();
		
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
			
		case '-':
			result=num1-num2;
			System.out.println(num1 + "-" + num2 + "=" + result);
			break;
			
		case '*':
			result=num1*num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;
			
		case '/':
			result=num1/num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
			break;
			
		default:
			System.out.println("Invalid operator");
			break;
		}
		input.close();
	}

}
