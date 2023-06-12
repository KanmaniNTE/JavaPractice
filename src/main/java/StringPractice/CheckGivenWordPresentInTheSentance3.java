package StringPractice;

public class CheckGivenWordPresentInTheSentance3 {

	public static void main(String[] args) {
	
		String str = "Java is an Object Oriented Programming Language and java is easy to learn.";
		String testWord = "java";	
		int count =1;
		str.toLowerCase();
		if(str.contains(testWord)) {
			System.out.println("Given word " + testWord + " present in the given String");
			count++;
		}else {
			System.out.println("Given word " + testWord + " not present in the given String");
		}
		if (count>1) {
			System.out.println("Given word "+ testWord + " present "+ count + " times");
		}
			

	}

}
