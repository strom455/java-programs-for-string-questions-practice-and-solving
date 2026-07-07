package string2.searchingquestions;

public class CountOccurencesOfWord {
	public static void main(String[] args) {
		String str = "java code with java";
		String word = "java";

		int count = 0;
		int index = str.indexOf(word);
		while (index != -1) {
			count++;
			index = str.indexOf(word, index + word.length());
		}
		System.out.println("total occurences = " + count);

	}
}
