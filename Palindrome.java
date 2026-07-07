package string;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i); // reverse string
		}
		if (str.equals(rev)) {
			System.out.println("palindrome"); // compare
		} else {
			System.out.println("not palindrome");
		}

	}
}

class PalindromePrint {
	public static void main(String[] args) {
		String[] arr = { "madam", "level", "java", "radar", "code" };

		for (String str : arr) {
			String rev = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			if (str.equals(rev)) {
				System.out.println(str);
			}
		}
	}
}