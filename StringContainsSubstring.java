package stringhw;

public class StringContainsSubstring {
	public static void main(String[] args) {
		String str = "code with java";

		if (str.contains("java")) {
			System.out.println("substring found");
		} else {
			System.out.println("substring not found");
		}
	}
}

class substring {
	public static void main(String[] args) {
		String str = " java programming ";
		System.out.println(str.contains("python"));
	}
}