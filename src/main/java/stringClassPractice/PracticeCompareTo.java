package stringClassPractice;

public class PracticeCompareTo {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "ab";
		String number = "12345656";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";
		
		System.out.println(empty.compareTo(blank));
		System.out.println(blank.compareTo(empty));
		System.out.println(onechar.compareTo(blank));
		System.out.println(blank.compareTo(onechar));
		System.out.println(onechar.compareTo(number));
		System.out.println(number.compareTo(onechar));
		System.out.println(word.compareTo(number));
		System.out.println(word1.compareTo("mani"));
		System.out.println("nmani".compareTo(word1));
		System.out.println(word2.compareTo("nte"));
	}

}
