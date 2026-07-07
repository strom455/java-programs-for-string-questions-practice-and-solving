package string;

public class SumOFAllDigits {
	public static void main(String[] args) {
		String str = "programing123";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= '0' && ch <= '9') {
				sum = sum + (ch - '0');

			}
		}
		System.out.println("sum " + sum);

	}
}

//replaceAll()

class DigitsSum {
	public static void main(String[] args) {
		String str = "programming123";
		String digits = str.replaceAll("[^0-9]", "");
		System.out.println(digits);

	}
}

//  CHarecyer.isdigit()

class ASumOffDigits {
	void Asum(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				sum = sum + (ch - '0');
			}

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		ASumOffDigits ooo = new ASumOffDigits();
		ooo.Asum("programming1234");
	}
}