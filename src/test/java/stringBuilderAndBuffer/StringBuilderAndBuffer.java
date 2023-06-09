package stringBuilderAndBuffer;

public class StringBuilderAndBuffer {
	
//	Whatever we can do in StringBuilder, we can do it in StringBuffer and vice versa
//	Only difference between them is Builder is no thread safe.
//	Both are mutable

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Sathya");
		StringBuilder builder1 = new StringBuilder("sathya");
		
		System.out.println(builder.compareTo(builder1));
		
		String str = "Kanmani";
		
		StringBuilder builder2 = new StringBuilder(str);
		System.out.println(builder2.reverse());
		
		
//		same you can do in StringBuffer
		
		StringBuffer buffer = new StringBuffer("Sathya");
		StringBuffer buffer1 = new StringBuffer("sathya");
		
		StringBuffer buffer2 = new StringBuffer(builder);
		
		
	}

}
