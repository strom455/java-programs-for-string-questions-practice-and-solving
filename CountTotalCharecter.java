package string2;

public class CountTotalCharecter {
	public static void main(String[] args) {
		String str = "code with trilok";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count++;
		}
		System.out.println("total char = " + count);

	}
}
