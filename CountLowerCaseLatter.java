package stringhw;

public class CountLowerCaseLatter {
	public static void main(String[] args) {
		String str = " cCOdE WITh JAva";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLowerCase(ch)) {
				count++;
			}
		}
		System.out.println("Lower Case Latter = " + count);
	}
}
