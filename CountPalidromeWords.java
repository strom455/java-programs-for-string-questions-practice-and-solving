package string2.palindromequestions;

public class CountPalidromeWords {
	public static void main(String[] args) {
		String str = "madam, mom, ror, eye, java ";
		 str = str.replace(",", "");
		String[] words = str.split(" ");
		int count = 0;

		   for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String rev = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}
			if(word.equals(rev)) {
				count++;
			}
		}
		System.out.println("Total palindrome word = " + count);
	}
	
}
