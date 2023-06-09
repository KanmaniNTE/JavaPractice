package stringClassPractice;

public class PracticeValueOf {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(word.valueOf(true));
		System.out.println(sentance.valueOf(false));
	}

}
