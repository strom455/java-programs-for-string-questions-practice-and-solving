package string2;

public class CountSpacialCharecter {
	public static void main(String[] args) {
		String str = "loki$#^!*^tril0ok";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9' || ch == ' '))) {
				count++;

			}
		}
		System.out.println("total Spacial chr = " + count);

	}
}
