package string2.substringquestions;

public class SubStringExists {
	public static void main(String[] args) {
		String str = "programming";
		String sub = "gram";

		if (str.contains(sub)) {
			System.out.println("sub string found");
		} else {
			System.out.println("not found");
		}
	}
}
