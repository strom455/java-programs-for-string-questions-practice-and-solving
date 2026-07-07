package stringhw;

public class CountSpaces {
	public static void main(String[] args) {
		String str = " trilok kumar java code and ";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				count++;                                // bruteforce

			}
		}
		System.out.println(" spaces count = " + count);
	}
}




class Space {
	public static void main(String[] args) {
		String str = "code with java";                         // split()

		int space = str.split(" ").length - 1;
		System.out.println("total spaces = " + space);
	}
}




class Space1 {
	public static void main(String[] args) {
		String str = "code with java programming";

		int space = str.length() - str.replace(" ", "").length();            //replace

		System.out.println("total spaces " + space);
	}

}