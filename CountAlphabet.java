package string2;

public class CountAlphabet {
	public static void main(String[] args) {

		String str = "code234trilok&*";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				count++;
			}
		}
		System.out.println("total alphabet = " + count);
	}
}
