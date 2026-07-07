package string;

public class Reverse {
   public static void main(String[] args) {
	String name = "trilok";

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
			
			
			  
		}
	}
}
    
    class reverse2{
    	public static void main(String[] args) {
			String name = " trilok";
			String rev = new StringBuilder(name).reverse().toString();
			System.out.println(rev);
		}
    }
     
    