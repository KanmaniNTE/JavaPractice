package stringClassPractice;

public class PracticeHashCode {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.hashCode());
		System.out.println(blank.hashCode());
		System.out.println(onechar.hashCode());
		System.out.println(number.hashCode());
		System.out.println(word.hashCode());
		System.out.println(sentance.hashCode());
	}

}
