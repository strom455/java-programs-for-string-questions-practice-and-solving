package string;

public class CountFrequencyAllchar {
	public static void main(String[] args) {
		String str = "code with java programming";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			boolean visited = false;

			for (int k = 0; k < i; k++) {
				if (str.charAt(k) == ch) {
					visited = true;
					break;
				}
			}

			if (visited) {
				continue;
			}
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ch) {
					count++;
				}
			}

			System.out.println(ch + " = " + count);
		}
	}
}