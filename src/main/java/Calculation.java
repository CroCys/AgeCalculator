import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculation {
	InputData userData = new InputData();

	public String calculateDifference() {
		long years = 0;
		long months = 0;
		long weeks = 0;
		long days = 0;

		System.out.println("Input first date");
		LocalDate date1 = userData.input();

		System.out.println("Input second date");
		LocalDate date2 = userData.input();

		try {
			if (date1 != null && date2 != null) {
				years = (int) ChronoUnit.YEARS.between(date1, date2);
				months = (int) ChronoUnit.MONTHS.between(date1, date2);
				weeks = (int) ChronoUnit.WEEKS.between(date1, date2);
				days = (int) ChronoUnit.DAYS.between(date1, date2);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return "Years: " + years + " Months: " + months + " Weeks: " + weeks + " Days: " + days;
	}
}
