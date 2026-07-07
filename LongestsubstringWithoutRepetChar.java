package string2.substringquestions;

public class LongestsubstringWithoutRepetChar {
	public static void main(String[] args) {
	String str = "abcabcabc";
	 String longest = "";
	
	for(int i =0; i<str.length(); i++) {
		String temp = "";
		
		for(int j =0; j<str.length(); j++) {
			char ch = str.charAt(j);
			
			if(temp.indexOf(ch) != -1) {
				break;
				
			}
			temp = temp + ch;
			if(temp.length() > longest.length()) {
				longest = temp;
			}
		}
		
	}
	System.out.println("Longest SubString = "+ longest);
	System.out.println("Length = " + longest.length());
}
}
