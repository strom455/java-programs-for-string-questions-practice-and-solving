
package string;
import java.util.Scanner;
public class LowerCase {
	public static void main(String[] args) {
		String str = "PROGRAMING";
		System.out.println(str.toLowerCase());
	}
}


class HelloJava{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name ");
		String name = sc.nextLine();
		
		
		String lower = name.toLowerCase();
		System.out.println(" lower case " + lower);
	}
}