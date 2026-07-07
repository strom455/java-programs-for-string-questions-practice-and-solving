package string2.searchingquestions;

public class FindOccurencesOfWord {
	public static void main(String[] args) {
		String str = "java is a very easy java lern";
		String word = "java";

		int index = str.indexOf(word);

		if (index == 1) {
			System.out.println("word not found ");

		}
		while (index != -1) {
			System.out.println(" occurence found at index = " + index);
			index = str.indexOf(word, index + 1);
		}

	}
}
