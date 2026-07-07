package string2;

public class AssciValuesFind {
	public static void main(String[] args) {
		String str = "programming123456";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch + " = " + (int) ch);
		}
	}
}