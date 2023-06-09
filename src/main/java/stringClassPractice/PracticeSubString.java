package stringClassPractice;

public class PracticeSubString {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";
		
		System.out.println(empty.substring(0));
		System.out.println(blank.substring(0));
		System.out.println(onechar.substring(0));
		System.out.println(number.substring(4));
		System.out.println(word.substring(3));
		System.out.println(word2.substring(8));
		System.out.println(sentance.substring(15));

	}

}
