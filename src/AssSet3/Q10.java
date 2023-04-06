/*What will be the DAY of current date in next year*/

package AssSet3;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Q10 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Current Date is : " + date);
		LocalDate date1 = date.plusYears(1);
		DayOfWeek dayOfWeek = date1.getDayOfWeek();
		System.out.println("Day of the current date in next year: " + dayOfWeek);

	}
}
