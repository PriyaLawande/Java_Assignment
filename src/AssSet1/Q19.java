/*19. Find no of characters in a given string which are not repeated. 
input: "hello"
output: 3*/
package AssSet1;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		String count = "";
		System.out.println("Enter your String:");
		input = sc.nextLine();

		int i;
		int arr[] = new int[256];
		for (i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ')
				arr[input.charAt(i)]++;
		}
		char nonrepeated = 0;
		System.out.print("All nonrepeated character in string are:");
		for (i = 0; i < input.length(); i++) {
			if (arr[input.charAt(i)] == 1) {
				nonrepeated = input.charAt(i);
				count = String.valueOf(nonrepeated);
				System.out.print(count);
			}
		}

	}

}
