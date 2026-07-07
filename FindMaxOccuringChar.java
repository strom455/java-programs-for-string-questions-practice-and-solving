package string2;

public class FindMaxOccuringChar {
	public static void main(String[] args) {
		String str = " code with java ";
		int max = 0;
		char maxChar = ' ';

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				maxChar = ch;

			}
		}
		System.out.println("Maximum occuring charecter = " + maxChar);
		System.out.println("frequency = " + max);
	}
}
