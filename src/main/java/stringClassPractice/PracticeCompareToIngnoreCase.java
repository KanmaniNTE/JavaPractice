package stringClassPractice;

public class PracticeCompareToIngnoreCase {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.compareToIgnoreCase(blank));
		System.out.println(blank.compareToIgnoreCase(empty));
		System.out.println(onechar.compareToIgnoreCase(blank));
		System.out.println(blank.compareToIgnoreCase(onechar));
		System.out.println(onechar.compareToIgnoreCase(number));
		System.out.println(number.compareToIgnoreCase(onechar));
		System.out.println(word.compareToIgnoreCase(number));
		System.out.println(word1.compareToIgnoreCase("mani"));
		System.out.println("nmani".compareToIgnoreCase(word1));
		System.out.println(word1.compareToIgnoreCase("Mani"));
		System.out.println(word2.compareToIgnoreCase("nte"));
	}

}
