package string;

public class SpacialChar {

	public static void main(String[] args) {

		String str = "java@123#code$%";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {

				System.out.print(ch);
			}
		}
	}
}