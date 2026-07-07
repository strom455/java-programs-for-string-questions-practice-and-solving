package string;

public class FindDuplicateChar {
	public static void main(String[] args) {
		String str = " code java programming ";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ') {
				continue;
			}
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
			if (count > 1) {
				System.out.println(ch);
			}
		}
	}
}
