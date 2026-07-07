package string;

public class VoweAndConsonent {
	public static void main(String[] args) {
		String str = "PROGRAMING";
		int count = 0;
		// str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
					|| ch == 'U' || ch == 'u') {
				count++;
			}
		}

		System.out.println(count);
	}
}

//consonents find ka code
class Consonent {
	public static void main(String[] args) {

		String str = "programming";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'e') {
				count++;

			}

		}
		System.out.println(count);
	}
}



 class EachVowel {
	
	public static void main(String[] args) {
		String str = "programming";
		str = str.toLowerCase();
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;

			}
		}
		System.out.println("a = " + a);
		System.out.println("e = " + e);
		System.out.println("i = " + i);
		System.out.println("o = " + o);
		System.out.println("u = " + u);
	}
	
	
	
	
//	char at()
//	lower case()
//    uppercase()
//    equals()
//	compare()
//	name.length()
//	concate()
//    contains()
//    replaceAll()
	
	
	
	
	
	
	
	
	
	
	
}
