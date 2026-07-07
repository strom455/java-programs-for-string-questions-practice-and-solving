package string2.substringquestions;

public class PrintSuffixAndPrefix {
   public static void main(String[] args) {
	String str = "JAVA";
	
	for(int i =1; i <= str.length(); i++) {
		System.out.println(str.substring(0, i));
	}
}
}



class sufix{
	public static void main(String[] args) {
		String str = "JAVA";
		
		for(int i =0; i < str.length(); i++) {
			System.out.println(str.substring(i));
		}
	}
}