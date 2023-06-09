package stringClassPractice;

public class PracticeStrip {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = " 1 2 3 4 5 ";
		String word = " Kanmani 123 ";
		String word1 = "Kanmani";
		String word2 = "                     Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";
//strip() is an instance method that returns a string whose value is the string with all leading and trailing white spaces removed.
		
		System.out.println(empty.strip());
		System.out.println(blank.strip());
		System.out.println(onechar.strip());
		System.out.println(number.strip());
		System.out.println(word.strip());
		System.out.println(word2.strip());
	}

}
