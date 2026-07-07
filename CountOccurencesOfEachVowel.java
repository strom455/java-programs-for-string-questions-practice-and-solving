package string2;

public class CountOccurencesOfEachVowel {
	public static void main(String[] args) {
		String str = " code with java ";

		int a = 0, e = 0, i = 0, o = 0, u = 0;

		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);

			if (ch == 'a') {
				a++;
			} else if (ch == 'e') {
				e++;
			} else if (ch == 'i') {
				i++;
			} else if (ch == 'o') {
				o++;
			} else if (ch == 'u') {
				u++;
			}

		}
		System.out.println("a = " + a);
		System.out.println("e = " + e);
		System.out.println("i = " + i);
		System.out.println("o = " + o);
		System.out.println("u = " + u);
	}
}
