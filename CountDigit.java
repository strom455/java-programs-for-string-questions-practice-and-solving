package string2;

public class CountDigit {
	public static void main(String[] args) {
		String str = "code with trilok";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= '0' && ch >= '9') {
				count++;
			}
		}
		System.out.println("total digits = " + count);
	}
}
