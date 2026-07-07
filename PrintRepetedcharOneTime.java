package string2;

public class PrintRepetedcharOneTime {
	public static void main(String[] args) {
		String str = "programming";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int count = 0;
			boolean visited = false;

			for (int k = 0; k < i; k++) {
				if (ch == str.charAt(k)) {
					visited = true;
					break;
				}
			}
			if (visited) {
				continue;
			}
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(ch);
			}

		}
	}

}
