package string2.palindromequestions;

public class palindromeIgnoringSpacialChar {
	public static void main(String[] args) {
		String str = "mad@$@%@^&@*&aM";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		str = str.toLowerCase();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
