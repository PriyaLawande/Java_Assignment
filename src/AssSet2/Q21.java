/*21.Find the number of days between two input dates.*/
package AssSet2;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Q21 {

	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.of(2022, Month.JANUARY, 01);
		LocalDate date2=LocalDate.of(2022, Month.FEBRUARY, 28);
		
		long noOfdaysBetween=ChronoUnit.DAYS.between(date1, date2);
		System.out.println(noOfdaysBetween);

	}

}
