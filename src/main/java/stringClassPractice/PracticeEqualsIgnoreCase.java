package stringClassPractice;

public class PracticeEqualsIgnoreCase {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String word3 = "makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.equalsIgnoreCase(blank));
		System.out.println(blank.equalsIgnoreCase(onechar));
		System.out.println(number.equalsIgnoreCase(sentance));
		System.out.println(word.equalsIgnoreCase(word1));
		System.out.println(word2.equalsIgnoreCase(word3));
	}

}
