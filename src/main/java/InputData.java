import java.time.LocalDate;
import java.util.Scanner;

public class InputData {
	public LocalDate input() {
		Scanner scanner = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		String input;
		boolean validInputYear = false;
		boolean validInputMonth = false;
		boolean validInputDay = false;

		try {
			while (!validInputYear) {
				System.out.print("Input year: ");
				input = scanner.next();
				if (input.matches("-?\\d+")) {
					year = Integer.parseInt(input);
					if (year > 0) {
						validInputYear = true;
					} else {
						System.out.println("Year cant be 0 or lower");
					}
				} else {
					System.out.println("Please input numeric");
				}
			}

			while (!validInputMonth) {
				System.out.print("Input month: ");
				input = scanner.next();
				if (input.matches("-?\\d+")) {
					month = Integer.parseInt(input);
					if (month > 0 && month < 13) {
						validInputMonth = true;
					} else {
						System.out.println("Input month in range 1 - 12");
					}
				} else {
					System.out.println("Please input numeric");
				}
			}

			while (!validInputDay) {
				System.out.print("Input day: ");
				input = scanner.next();
				if (input.matches("-?\\d+")) {
					day = Integer.parseInt(input);
					if (day > 0 && day < 32) {
						validInputDay = true;
					} else {
						System.out.println("Input day in range 1 - 31");
					}
				} else {
					System.out.println("Please input numeric");
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return LocalDate.of(year, month, day);
	}
}
