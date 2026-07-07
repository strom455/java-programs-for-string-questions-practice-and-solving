package stringhw;

public class CountWords {
	public static void main(String[] args) {
		String str = " trilok with java code";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) {
				count++;
			}
		}
		System.out.println(" words count = " + count);

	}
}

class words {
	public static void main(String[] args) {
		String str = "java code with trilok kumar";

		String[] words = str.split(" ");

		System.out.println( "words count = " + words.length);
	}
}