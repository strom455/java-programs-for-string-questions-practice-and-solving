package string;

public class NamePrint {
   public static void main(String[] args) {
	String name = "trilok";
	System.out.println(name);
	for( int i =0; i<name.length(); i++) {
		System.out.println( "trilok " + i + " = "+name.charAt(i));
	}
}
}
