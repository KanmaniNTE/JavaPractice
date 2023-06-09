package stringClassPractice;

public class PracticeReplace {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";

		System.out.println(empty.replace("", "Chennai"));
		System.out.println(empty);
		System.out.println(blank.replace(" ", "Mani"));
		System.out.println(blank);
		System.out.println(number.replace("1", "8"));
		System.out.println(word.replace("a", "k"));
		System.out.println(word1.replace("Kan", "mani"));
		System.out.println(sentance.replace(" ", "#"));
		
	}

}
