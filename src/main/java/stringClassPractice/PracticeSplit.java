package stringClassPractice;

public class PracticeSplit {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";
		
		PracticeSplit obj = new PracticeSplit();
		System.out.println("Split the Sentance");
		obj.splitAStringByCharacters(sentance);

		String[] allString = number.split("");
		for (String eachString : allString) {
			System.out.println(eachString);
		}
		String[] test = word.split("");
		for (String eachString : test) {
			System.out.println(eachString);
		}
		String[] test1 = sentance.split("a");
		for (String eachString : test1) {
			System.out.println(eachString);
		}
		
		

	}
	public void splitAStringByCharacters(String text) {
		for (int i = 0; i < text.length(); i++) {
			char eachChar = text.charAt(i);
			System.out.println(eachChar);
		}
	}
}
