package string;

public class PrintDigitFromArray {
	public static void main(String[] args) {
		String str = "programming123";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= '0' && ch <= '9') {
				System.out.println(ch + " ");
			}
		}
	}
}


//replaceAll()

class Digit {
	public static void main(String[] args) {
		String str = "programming123";

		 String digits = str.replaceAll("[^0-9]", "");
		System.out.println(digits);
	}
}