package stringClassPractice;

public class PracticeContains {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.contains("abc"));
		System.out.println(blank.contains(empty));
		System.out.println(empty.contains(blank));
		System.out.println(word.contains("ma"));
		System.out.println(word2.contains("ma"));
	}

}
