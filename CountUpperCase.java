package string;

public class CountUpperCase {
	public static void main(String[] args) {
		String str = "JaVa ProGRAM123";
		int uppercase = 0;
		int lowerCase = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				uppercase ++;

			} else if (Character.isLowerCase(ch)) {
				 lowerCase++;
			}
		}
		System.out.println("uppercase  = " + uppercase);
		System.out.println("lowercase  = " +  lowerCase );
	}
}
