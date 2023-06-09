package stringClassPractice;

public class PracticeConcat {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.concat(onechar));
		System.out.println(blank.concat(onechar));
		System.out.println(number.concat(word));
		System.out.println(word1.concat(word2));
		System.out.println(onechar.concat("Java lang"));
		System.out.println(sentance.concat(". It is easy to use."));
		
	}

}
