package string2.searchingquestions;

public class FindLongestWord {
	public static void main(String[] args) {
		String str = "i love java programming";

		String[] words = str.split(" ");
		String longest = words[0];

		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		System.out.println("longest = " + longest);
	}
}
