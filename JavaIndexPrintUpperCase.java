package string;

public class JavaIndexPrintUpperCase {
	public static void main(String[] args) {
		String str = "JaVa ProGRAM123";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				System.out.println("index " + i + ":" + ch);
			}
		}

	}
}
