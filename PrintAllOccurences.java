package stringhw;

public class PrintAllOccurences {
	public static void main(String[] args) {
		String str = "programming";
		char ch = 'm';

		int index = str.indexOf(ch);
		while (index != -1) {
			System.out.println(ch + " index at " + index);
			index = str.indexOf(ch, index + 1);
		}
	}
}
  



