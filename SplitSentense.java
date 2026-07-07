package string;

public class SplitSentense {
	void hesedString(String str) {
		String[] val = str.split(" ");
		for(String s : val) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		String str = "java is fun ";
		SplitSentense obj = new SplitSentense();
		obj.hesedString(str);
	}
}




