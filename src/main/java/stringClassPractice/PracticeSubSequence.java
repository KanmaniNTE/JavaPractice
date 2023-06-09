package stringClassPractice;

public class PracticeSubSequence {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";
//		System.out.println(empty.subSequence(0, 1));
		System.out.println(number.subSequence(1, 5));
		System.out.println(word.subSequence(2, 5));
		System.out.println(word.subSequence(1, 6));
		System.out.println(word2.subSequence(4, 6));
		System.out.println(sentance.subSequence(20, 44));
		
		
	}

}
