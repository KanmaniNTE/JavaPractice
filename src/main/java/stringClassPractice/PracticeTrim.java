package stringClassPractice;

public class PracticeTrim {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "  Kanmani  ";
		String word2 = "         Makinthan    ***    ";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(word.trim());
		System.out.println(word1.trim());
		System.out.println(sentance.trim());
		System.out.println(word2.trim());
		//removes white space before and after the word
	}

}
