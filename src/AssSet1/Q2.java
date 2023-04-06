/*2.Find the day(Friday) of a date input given as MM-dd-yyyy (format) 
input:12-27-2012
output:Thursday*/

package AssSet1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q2 {

	public static void main(String args[]) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date date = sdf.parse("03-22-2023");

		sdf.applyPattern("EEEE");
		String str = sdf.format(date);
		System.out.println(str);
	}
}
