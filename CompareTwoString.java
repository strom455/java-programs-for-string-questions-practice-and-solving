package stringhw;

public class CompareTwoString {
	public static void main(String[] args) {
		String str = " code with java ";
		String str2 = " code with trilok ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.equals(str2)) {
				System.out.println(" both are equals ");
			} else {
				System.out.println(" both are not equals ");
				return;
			}
		}
	}
}
