package string2.searchingquestions;

public class FindLastSubstring {
	public static void main(String[] args) {
		String str = "code with java";
		String sub = "java";
		int index = str.indexOf(sub);

		if (index != -1) {
			System.out.println("last index = " + index);
		} else {
			System.out.println("not found");
		}
	}
}
