/*Write a program to display Day of the week using Switch case
    Ex: Day=3 then display 'Wednesday'*/

package ArrayAssignment;

import java.util.Scanner;

public class DayOfWeekSwitchCase {

	public static void main(String[] args) {
		
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of day:");
		day=sc.nextInt();
		
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2: 
			System.out.println("Tuesday");
			break;
			
		case 3: 
			System.out.println("Wenesday");
			break;
			
		case 4: 
			System.out.println("Thursday");
			break;
			
		case 5: 
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7: 
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("This day is not found");
			break;
		}
	}
}
