package string2.searchingquestions;

public class CompareTwoStrings2 {
	public static void main(String[] args) {
		String str = "code with java";
		String str2 = "code with python";
		System.out.println(str.compareTo(str2));
	}
}

class Compare {
	public static void main(String[] args) {
		String str = "code with java";
		String str2 = "code with c++";
		System.out.println(str.compareToIgnoreCase(str2));
	}
}