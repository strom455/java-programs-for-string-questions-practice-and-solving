package stringhw;

public class CountConsonents {
	public static void main(String[] args) {
		String str = "code with java ";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
		char ch = Character.toLowerCase(str.charAt(i));
			
			if (ch != 'a' && ch != 'e' && ch != 'o' && ch != 'u' && ch != 'e') {
             count++;
			}
		}
		System.out.println("consonent count " + count);
	}
}
