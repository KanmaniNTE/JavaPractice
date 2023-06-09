package stringClassPractice;

public class PracticeIndexOf {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";
//returns the position of the first occurrence of specified character(s) in a string.
		System.out.println(empty.indexOf(0));
		System.out.println(blank.indexOf(1));
		System.out.println(onechar.indexOf(word));
		System.out.println(number.indexOf(onechar));
		System.out.println(word.indexOf(word1));
		System.out.println(word.indexOf("a"));
		System.out.println(word.indexOf("z"));
		
		
	}

}
