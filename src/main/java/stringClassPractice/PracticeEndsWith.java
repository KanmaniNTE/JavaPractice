package stringClassPractice;

public class PracticeEndsWith {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthane";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.endsWith(onechar));
		System.out.println(blank.endsWith(onechar));
		System.out.println(onechar.endsWith(onechar));
		System.out.println(word.endsWith(word1));
		System.out.println(word2.endsWith(word1));
		System.out.println(word1.endsWith(word2));
		System.out.println(sentance.endsWith(blank));
		System.out.println(sentance.endsWith(empty));
		System.out.println(sentance.endsWith(word2));
		System.out.println(sentance.endsWith("e"));
		System.out.println(sentance.endsWith("language"));
	}

}
