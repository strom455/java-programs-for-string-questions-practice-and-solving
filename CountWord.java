package string2;

public class CountWord {
	public static void main(String[] args) {
		String str = "hii this is me trilok";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (str.charAt(i) == ' ') {
             count++;
			}
		}
		System.out.println(" total word = " + count);

	}
}
