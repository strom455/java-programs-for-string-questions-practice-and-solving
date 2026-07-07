package string;


public class HasedString {
  void hasedString(String str) {
	  String[] val = str.split(" ");
	  String str1 = "#";
	  
	  for(String s : val) {
		 str1 = str1 + Character.toUpperCase(s.charAt(0))+s.substring(1);
		 
	  }
	  System.out.println(str1);
  }
  public static void main(String[] args) {
	  HasedString obj = new HasedString();
	  obj.hasedString("java is fun");
}
}




class Program {
	public static void main(String[] args) {
		String str = "programming";
		System.out.println(str.substring(0,7));
	}
	   
	}




