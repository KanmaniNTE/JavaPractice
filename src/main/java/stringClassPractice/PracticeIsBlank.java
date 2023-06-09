package stringClassPractice;

public class PracticeIsBlank {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.isBlank());
		System.out.println(blank.isBlank());
		System.out.println(onechar.isBlank());
		System.out.println(number.isBlank());
		System.out.println(word.isBlank());
		System.out.println(sentance.isBlank());
		
	}

}
