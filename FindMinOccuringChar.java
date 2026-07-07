package string2;

public class FindMinOccuringChar {
	public static void main(String[] args) {
		String str = "code with java ";
		int min = str.length();
		char minChar = ' ';

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}

			}
			if (count < min) {
				min = count;
				minChar = ch;
			}
		}
		System.out.println("minimum occuring charecter = " + minChar);
		System.out.println("frequency = " + min);
	}
}
