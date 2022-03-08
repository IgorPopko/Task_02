package by.it_academy.popko.homework;

import java.util.Arrays;

public class SecondHomeworkSecondTask {

//	Дана строка. Разделить строку на фрагменты по три подряд 
//	идущих символа. В каждом фрагменте средний символ заменить 
//	на случайный символ (!!!Я брал английский алфавит!!!), не совпадающий 
//	ни с одним из символов этого фрагмента. Показать фрагменты, упорядоченные по алфавиту.

	public static void main(String[] args) {

		String originalString = "nnnpppttthhhsssaaapppqqqlllzzzvvvbbb";

		String[] splitlString = splitIntoThreeCharacters(originalString);
		
		printStringArray(splitlString);

		replaceMiddleCharacter(splitlString);
		
		printStringArray(splitlString);

		Arrays.sort(splitlString);
		
		printStringArray(splitlString);

	}

	public static String[] splitIntoThreeCharacters(String string) {
		String[] array = new String[string.length() / 3];
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = string.substring(temp, temp + 3);
			temp = temp + 3;
		}
		return array;
	}

	public static void replaceMiddleCharacter(String[] string) {

		for (int i = 0; i < string.length; i++) {
			char d = getRandomCharacter(string[i]);
			string[i] = string[i].substring(0, 1) + d + string[i].substring(2);
		}
	}

	public static char getRandomCharacter(String str) {
		char ch = str.charAt(1);

		while (ch == str.charAt(0) || ch == str.charAt(1) || ch == str.charAt(2)) {
			ch = (char) (Math.random() * 26 + 97);
		}
		return ch;
	}

	public static void printStringArray(String[] string) {
		System.out.println("Your string is: " + Arrays.toString(string));
	}
}
