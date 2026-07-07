package string;
import java.util.Scanner;
class Uppercase {
	public static void main(String[] args) {
		String name = "trilok";
		System.out.println(name.toUpperCase());
	}

}


class HelloTrilok {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" enetr name ");
		String name = sc.nextLine();

		String upper = name.toUpperCase();

		System.out.println("upper case " + upper);

	}
}