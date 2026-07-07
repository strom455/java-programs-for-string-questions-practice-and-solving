package string2.substringquestions;

public class ExatractFirstWord {
	public static void main(String[] args) {
		String str = "code with python";

		String[] words = str.split(" ");

		System.out.println("first word = " + words[0]);

	}
}

class Last {
	public static void main(String[] args) {
		String str = " i love java";

		String[] words = str.split(" ");

		System.out.println("last word = " + words[words.length -1]);
	}
}