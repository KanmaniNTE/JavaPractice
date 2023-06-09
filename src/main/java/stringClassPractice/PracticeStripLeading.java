package stringClassPractice;

public class PracticeStripLeading {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "           12345";
		String word = "Kanmani          NTE    ";
		String word1 = "Kanmani          ";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";
		
		System.out.println(empty.stripLeading());
		System.out.println(blank.stripLeading());
		System.out.println(number.stripLeading());
		System.out.println(word.stripLeading());
		System.out.println(word1.stripLeading());

	}

}
