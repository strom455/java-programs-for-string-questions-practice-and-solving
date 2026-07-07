package stringhw;

public class CountSpacialCharacter {
	public static void main(String[] args) {
		String str = "code #$@&$ with java";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!Character.isDigit(ch) && !Character.isDigit(ch) && ch != ' ') {
				count++;
			}
		}
		System.out.println("spacial character count = " + count);
	}
}
