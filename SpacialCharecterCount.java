package string;

public class SpacialCharecterCount {
	public static void main(String[] args) {
		String str = "java@123#code";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
				count++;
			}
		}

		System.out.println(count);
	}
}

//replace all charecter.isLetterOrDigit()
//replaceAll()
//se esi code ko karna hai

class Spacialchar {
	public static void main(String[] args) {
		String str = "java@$%7&coding";

		String Spacialchar = str.replaceAll("[A-Za-z0-9]", "");
		System.out.println(Spacialchar);

	}
}

   class SpacialCharPrint11{
	   public static void main(String[] args) {
		String str = "java#$@codewithtr!*&";
		 
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!Character.isLetter(ch) && !Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}
	}
   }

   
  class SpacialCharPrint1{
	  public static void main(String[] args) {
		String str = "java123@code#";
		
	}
  }
  















