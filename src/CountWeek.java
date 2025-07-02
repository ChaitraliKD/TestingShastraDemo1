
public class CountWeek {
	String longestString = "";
	private String[] name;

	public CountWeek(String[] name) {
		this.name = name;
	}

	//
	public void longestString() {
		for (String result : name) {
			if (result.length() > longestString.length()) {
				longestString = result;
			}
		}
		System.out.println(longestString);
	}

	public void reverseString() {
		for (int i = name.length - 1; i >= 0; i--) {
			System.out.println(name[i]);
		}
	}
}
