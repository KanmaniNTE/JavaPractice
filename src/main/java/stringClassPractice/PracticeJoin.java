package stringClassPractice;

public class PracticeJoin {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

//		System.out.println(empty.join(onechar, word2));
//		System.out.println(blank.join(number, word1));
//		System.out.println(String.join(onechar, sentance));
//		String.join(sentance, " I am Learning.");
//		System.out.println(sentance);
//		System.out.println(number.join(word, word2));
//		System.out.println(String.join("ECE", "Engineering"));
		String.join(word, onechar);
	}

}
