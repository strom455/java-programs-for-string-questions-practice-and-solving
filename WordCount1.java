package stringhw;

import java.util.StringTokenizer;

public class WordCount1 {
	public static void main(String[] args) {
		String str = "programming with java ";

		StringTokenizer st = new StringTokenizer(str);

		System.out.println("total words = " + st.countTokens());
	}
}

class word {
	public static void main(String[] args) {
		String str = "code with java";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("total words = " + count);
	}
}
