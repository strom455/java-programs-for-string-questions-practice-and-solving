package string2;

public class SortCharAlphabeticaly {
	public static void main(String[] args) {
		String str = "code with java ";

		char[] arr = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		System.out.println(arr);
	}

}
