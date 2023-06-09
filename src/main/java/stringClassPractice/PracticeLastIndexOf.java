package stringClassPractice;

public class PracticeLastIndexOf {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.lastIndexOf("1"));
		System.out.println(blank.lastIndexOf(0));
		System.out.println(onechar.lastIndexOf(0));
		System.out.println(number.lastIndexOf("5"));
		//number 5 index id 4
		System.out.println(number.lastIndexOf(2));
		System.out.println(word.lastIndexOf("i"));
		System.out.println(word.lastIndexOf("a"));
		System.out.println(sentance.lastIndexOf("a"));
		//in sentance last 'a' index is 44
		System.out.println(sentance.lastIndexOf("ge"));
		
	}

}
