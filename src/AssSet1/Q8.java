/*8. A time input is received as stirng. Find if the hour format is in 12 hour format. 
the suffix am/pm is
 case insensitive.
input:"09:36 am"
output:true*/

package AssSet1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q8 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("h:mm a"); // h -> 12 hr format //  H-> 24hr format
		sdf.setLenient(false);
		
		try {
			Date d = sdf.parse(s1);
			String s2 = sdf.format(d);
			System.out.println("Given format is of 12 hr");
		} catch (ParseException e) {
			System.out.println("Given format is not of 12 hr");
		}
	}
}
