package stringClassPractice;

public class PracticeStartsWith {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "J";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.startsWith(onechar));
		System.out.println(blank.startsWith(onechar));
		System.out.println(onechar.startsWith(onechar));
		System.out.println(word.startsWith(word1));
		System.out.println(word2.startsWith(word1));
		System.out.println(sentance.startsWith(empty));
		System.out.println(sentance.startsWith(blank));
		System.out.println(sentance.startsWith(onechar));
		System.out.println(sentance.startsWith("Ja"));
	}

}
