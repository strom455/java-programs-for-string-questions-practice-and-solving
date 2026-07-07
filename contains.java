package string;

public class contains {

	public static void main(String[] args) {

		String str = "Programming";

		int vowels = str.replaceAll("[^AEIOUaeiou]", "").length();

		System.out.println(str.length() - vowels);
	}
}

class conscount {
	public static void main(String[] args) {
		String str = "programming";
		String vowels = "aeiouAEIOU";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!vowels.contains(String.valueOf(ch))) {
				count++;
			}

		}
		System.out.println(count);
	}
}