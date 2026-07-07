package string;

public class CountFrequency {
	public static void main(String[] args) {
		String str = "code with java";
		char ch = 'a';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("frequency of '" + ch + "' = " + count);
	}
}
