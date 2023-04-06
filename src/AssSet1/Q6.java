/*6. Given date in dd-MM-yyyy format.return the month in full name format(January) 
input:"23-01-2012"
output:January*/

package AssSet1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q6 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse("23-01-2012");

		sdf.applyPattern("MMMM");
		
		String str = sdf.format(date);
		System.out.println(str);

	}

}
