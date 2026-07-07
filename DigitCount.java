
package string;

public class DigitCount {
   public static void main(String[] args) {
	String str = "abcd123xy45";                           //  Charecter.isDigit()
	int count = 0;
	
	for( int i =0; i < str.length(); i++) {
		if(Character.isDigit(str.charAt(i))) {
		count++;
	}
}
	System.out.println("digit count = " + count);
   }
}


//replaceAll()

class DigitCount1{
	public static void main(String[] args) {
		String str = "abcd123xy145";
		String digits = str.replaceAll("[^0-9]", "");
		System.out.println("digit count = " + digits.length());
	}
}


//charAt()

class DigitCount2{
	public static void main(String[] args) {
		String str = "abcd1234xyz445";
		int count =0;
		
		for(int i =0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9' ) {
				count++;
			}
		}
		System.out.println("digit count = " + count);
	}
}



//Split()

class DigitCount3{
	public static void main(String[] args) {
		String str = "1234xyz2345";
		
		String[] arr = str.split("[^0-9]");
		
		int count =0;
		for(String s : arr) {
			count += s.length();
			
		}
		System.out.println("Digit count = " + count);
	}
}



class Digits{
	
}


















