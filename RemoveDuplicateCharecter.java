package stringhw;

public class RemoveDuplicateCharecter {
	public static void main(String[] args) {
		String str = "programming with java";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean duplicate = false;

			for (int j = 0; j < i; j++) {
				if (ch == str.charAt(j)) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.println(ch);
			}
		}
	}
}
