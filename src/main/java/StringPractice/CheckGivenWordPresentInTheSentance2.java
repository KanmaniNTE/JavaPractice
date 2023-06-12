package StringPractice;

public class CheckGivenWordPresentInTheSentance2 {

	public static void main(String[] args) {
	
		String str = "Java is an Object Oriented Programming Language and java is easy to learn.";
		String testWord = "Java";
		
		
		if(str.indexOf(testWord) != -1) {
			System.out.println("Given " + testWord + " present in the given String");
		}else {
			System.out.println("Given " + testWord + " not present in the given String");
		}
			

	}

}
