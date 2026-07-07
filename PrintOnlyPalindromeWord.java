package string2.palindromequestions;

public class PrintOnlyPalindromeWord {
	public static void main(String[] args) {
		String str = "mom, madam, java, python";
		 str = str.replace(",", "");
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			String rev = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			if (word.equals(rev)) {
				System.out.println(word);
			}
		}
	}
}
