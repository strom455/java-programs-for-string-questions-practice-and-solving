package stringhw;

public class CountUpperCaseLatter {
	public static void main(String[] args) {
		String str = "Code wTh JAvA";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		System.out.println("uppercase letter = " + count);
	}
}
