package string;

public class PrintDigitLetterSpacial {
   public static void main(String[] args) {
	String str = "java123@code#";
	int letter =0, digit =0, spacial =0;
	for(int i =0; i<str.length(); i++) {
		char ch = str.charAt(i);
		if(Character.isLetter(ch)) {
			letter++;
			
		}
		else if(Character.isDigit(ch)) {
			digit++;
		}
		else {
			spacial++;
		}
			
	}
	System.out.println("letter = " + letter);
	System.out.println("digits = "+ digit);
	System.out.println("spacial Character = " + spacial);
   }
}

