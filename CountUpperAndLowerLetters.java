package string2;

public class CountUpperAndLowerLetters {
	public static void main(String[] args) {
		String str = "cOde wiTh jAva";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				count++;
			}
		}
		System.out.println("Upper latters = " + count);
	}

}

 class Lower1 {
	public static void main(String[] args) {
		String str = "COde With LOKi";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				count++;
			}
		}
		System.out.println("Lower letters = " + count);
	}
}