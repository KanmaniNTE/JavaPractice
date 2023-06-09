package stringClassPractice;

public class PracticeRepeat {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "1234512345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.repeat(0));
		System.out.println(blank.repeat(0));
		System.out.println(onechar.repeat(0));
		System.out.println(number.repeat(3));
		System.out.println(word.repeat(1));
		System.out.println(word1.repeat(2));
		System.out.println(word2.repeat(10));
		System.out.println(sentance.repeat(5));
	}

}
