package stringClassPractice;

public class PracticeStripTrailing {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "           12345";
		String word = "Kanmani   NTE          ";
		String word1 = "Kan  mani           ";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.stripTrailing());
		System.out.println(blank.stripTrailing());
		System.out.println(number.stripTrailing());
		System.out.println(word.stripTrailing());
		System.out.println(word1.stripTrailing());
	}

}
