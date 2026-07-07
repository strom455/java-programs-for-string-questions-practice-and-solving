package stringhw;

public class ReversePrint {
    public static void main(String[] args) {
		String str = "trilok";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
		}
		System.out.println("reverse " + str);
	}
}
