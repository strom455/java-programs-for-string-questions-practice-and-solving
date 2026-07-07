package string2.searchingquestions;

public class LastOccurenceIndex {
	public static void main(String[] args) {
		String str = "programming";
		char ch = 'g';
		int index = str.lastIndexOf(ch);
		if (index != -1) {
			System.out.println("last Occurence = " + index);
		} else {
			System.out.println("not found");
		}
	}
}
