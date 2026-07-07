package string2.substringquestions;

public class CountSubStringOccurences {
	public static void main(String[] args) {
		String str = "codewithcodejava ";
		String sub = "code";
		int count = 0;

		int index = str.indexOf(sub);

		while (index != -1) {
			count++;
			index = str.indexOf(sub, index + sub.length());

		}
		System.out.println("total occurences = " + count);
	}
}
