package string2;

public class RemoveFirstOccurences {
	public static void main(String[] args) {
		String str = "programming";
		char remove = 'r';

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != remove) {
				System.out.println(ch);
			}

		}
	}
}
