package string2.searchingquestions;

public class FindAllOccurencesOfChar {
	public static void main(String[] args) {
		String str = "programming";
		char ch = 'm';
		boolean found = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.println("occurences found at index = " + i);
				found = true;
			}
		}
		if (!found) {
			System.out.println(" not found ");
		}
	}
}
