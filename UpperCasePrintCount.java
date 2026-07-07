package string;

public class UpperCasePrintCount {
	public static void main(String[] args) {
		String str = " JaVa ProGRAM123";
		int count = 0;
		System.out.println("uppercase Latters ");

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("total Uppercase Latters = " + count);
	}
}
