package stringhw;

public class CompareStringIgnoringCase {
	public static void main(String[] args) {
		String str = " code with java ";
		String str2 = " code with java ";

		if (str.equalsIgnoreCase(str2)) {
			System.out.println(" BOTH ARE EQUALS ");

		} else {
			System.out.println("both are not equals ");
		}

	}
}
