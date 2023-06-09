package stringClassPractice;

public class PracticeToCharArray {

	public static void main(String[] args) {
		String empty = "";
		String blank = " ";
		String onechar = "a";
		String number = "12345";
		String word = "Kanmani";
		String word1 = "Kanmani";
		String word2 = "Makinthan";
		String sentance = "Java is an Object Oriented Programming Language";
//		PracticeToCharArray obj = new PracticeToCharArray();
		char[] split1 = word.toCharArray();

		for (char each : split1) {
			System.out.println(each);
		}
		
		char[] text1 = word2.toCharArray();

		for (char each : text1) {
			System.out.println(each);
		}
	
	}
	public void ToCheckToChaarArray() {
		// here no parametrisation availble, so not able to create mehod
	}
		
	}


