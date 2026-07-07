package string2.searchingquestions;

public class FirstOccurenceIndex {
	public static void main(String[] args) {
		String str = " programming";
		char ch = 'r';

		int index = str.indexOf(ch);
		if (index != -1) {
			System.out.println(" first occurence index = " + index);

		} else {
			System.out.println("charectyer not found");
		}
	}
}
