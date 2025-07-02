
public class CountWeekRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		CountWeek countWeek = new CountWeek(daysOfWeek);
		countWeek.longestString();
		countWeek.reverseString();
	}

}
