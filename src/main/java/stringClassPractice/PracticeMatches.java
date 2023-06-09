package stringClassPractice;

public class PracticeMatches {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "kanmani";
		String word2 = "Makinthan";
		String sentance = "Kanmani Java is an Object Oriented Programming Language";

		System.out.println(empty.matches(sentance));
		System.out.println(empty.matches(blank));
		System.out.println(blank.matches(blank));
		System.out.println(onechar.matches(blank));
		System.out.println(number.matches(onechar));
		System.out.println(word.matches(word1));
		System.out.println(word.matches("mani"));
		System.out.println(word.matches("Kanmani"));
		System.out.println(word.matches(sentance));
		System.out.println(sentance.matches(word));
	}

}
