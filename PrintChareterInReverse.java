package string2;

public class PrintChareterInReverse {
   public static void main(String[] args) {
	String str = "trilok and java";
	
	for(int i = str.length()-1; i>= 0; i--) {
		System.out.println(str.charAt(i));
	}
}
   
}
