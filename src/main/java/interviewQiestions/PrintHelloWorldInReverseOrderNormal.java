package interviewQiestions;

public class PrintHelloWorldInReverseOrderNormal {

	public static void main(String[] args) {
		String str = "Hello World";
		String[] words =str.split("\s");
		String reverseWord = "";
		for(String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord = reverseWord+sb.toString()+" ";
			
		}
		System.out.println(reverseWord);

	}

}
