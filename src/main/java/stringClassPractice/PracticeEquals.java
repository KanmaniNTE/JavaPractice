package stringClassPractice;

public class PracticeEquals {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language. Kanmani";
		String obj = new String("Kanmani");
		String obj1 = new String("Kanmani");

		System.out.println(empty.equals(blank));
		System.out.println(blank.equals(onechar));
		System.out.println(number.equals(sentance));
		System.out.println(word.equals(word1));
		
		if(word == word1) {
			System.out.println(true);
		}
		if(obj == obj1) {
			System.out.println("Hello");
			//Checking location of the object
		}
		if(obj.equals(obj1)) {
			System.out.println("HI");
			//checking the values of variable
		}
		
	}

}
