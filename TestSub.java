package stringhw;

public class TestSub {
	public static void main(String[] args) {
		String str = "programming";
		String subString = "gram";
		if (str.indexOf(subString) != -1) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}

	}
}
