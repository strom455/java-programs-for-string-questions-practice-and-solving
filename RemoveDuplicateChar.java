package string2;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str = "programmig";

		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			boolean visited = false;

			for (int j = 0; j < i; j++) {

				if (ch == str.charAt(j)) {
					visited = true;
					break;
				}
			}
			if (!visited) {
				System.out.println(ch);

			}
		}
	}
}
