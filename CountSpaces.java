package string2;

public class CountSpaces {
	public static void main(String[] args) {
		String str = "code with java";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ') {
				count++;
			}
		}
		System.out.println(" Total spaces = " + count);

	}
}
