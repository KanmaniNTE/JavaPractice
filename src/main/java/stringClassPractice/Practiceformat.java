package stringClassPractice;

public class Practiceformat {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanm*ani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";
//Returns a formatted string using the specified locale, format string, and arguments
		System.out.println(empty.format("Mak", "Kanu"));
		System.out.println(blank.format(word2, args));
		System.out.println(onechar.format(word, word2));
		System.out.println(number.format(word1, args));
		System.out.println(number);
		
		
	}

}
