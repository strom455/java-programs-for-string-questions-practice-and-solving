package string2.searchingquestions;

public class FirstSubString {
	public static void main(String[] args) {
		String str = "code with java and code with trilok";
		String sub = "java";
		int index = str.indexOf(sub);

		if (index != -1) {
			System.out.println("first index = " + index);

		} else {
			System.out.println("not found");
		}
	}
}
