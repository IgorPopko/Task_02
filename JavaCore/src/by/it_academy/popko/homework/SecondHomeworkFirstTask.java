package by.it_academy.popko.homework;

public class SecondHomeworkFirstTask {

	public static void main(String[] args) {

		String stringFirst = getNumbers(5);

		String stringSecond = getLetters(5);

		String stringThird = getTwoLastLetters(stringFirst);

		printRandomString(stringFirst, stringSecond, stringThird);
	}

	public static String getNumbers(int n) {
		int x;
		String s = "";
		String[] string = new String[n];

		for (int i = 0; i < string.length; i++) {
			do {
				x = (int) (Math.random() * 10);
			} while (x % 2 != 0);
			string[i] = s + x;
		}
		s = String.join(s, string);
		return s;
	}

	public static String getLetters(int n) {
		char ch;
		String s = "";
		String[] string = new String[n];

		for (int i = 0; i < string.length; i++) {
			ch = (char) (Math.random() * 26 + 97);
			string[i] = s + ch;
		}
		s = String.join(s, string);
		return s;
	}

	public static String getTwoLastLetters(String str) {
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '8') {
				s = "AB";
				break;
			} else {
				s = "XY";
			}
		}
		return s;
	}

	public static void printRandomString(String First, String Second, String Third) {
		String string;
		string = First + Second + Third;
		System.out.println("Random string is: " + string);
		System.out.println("Length random string is: " + string.length());

	}
}
