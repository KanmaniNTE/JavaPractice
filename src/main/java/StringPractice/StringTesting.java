package StringPractice;

public class StringTesting {

	public static void main(String[] args) {
		String str = "Kanmani";
		String str1 = "Makinthan";
		String str2 = "Santhosh";
		String str3 = "";
		String str4 = "Kanmani";
		String str5 = "b";
		String str6 = " ";

		str.charAt(0);
		System.out.println("Split the string using for loop");
		for (int i = 0; i < str.length(); i++) {
			char split = str.charAt(i);
			System.out.println(split);
		}

//		public void splitAStringByCharacters(String text) {
//			for (int i = 0; i < text.length(); i++) {
//				char eachChar = text.charAt(i);
//				System.out.println(eachChar);
//			}
//		}
		System.out.println("Split using advanced for loop and split");
//		String[] allString = str.split("");
		String[] allString = str.split("a");
		for (String eachString : allString) {
			System.out.println(eachString);
		}
		System.out.println("Split using toCharArray");
		char[] split1 = str.toCharArray();

		for (char each : split1) {
			System.out.println(each);
		}
		System.out.println("Count the String Length");
		int strlen = str.length();
		System.out.println(strlen);

		// Check the String isEmpty
		System.out.println("Check the String isEmpty");
		System.out.println(str1.isEmpty());
		boolean stremt = str3.isEmpty();
		System.out.println(stremt);

		System.out.println("Check the equals");
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str2));
		boolean strequ = str3.equals(str2);
		System.out.println(strequ);

		System.out.println("Check equalsIgnoreCase");
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str1.equalsIgnoreCase(str3));
		boolean equing = str2.equalsIgnoreCase(str1);
		System.out.println(equing);

//		public void validateTwoStringsAreEqual(String str1, String str2) {
//			boolean equing = str2.equalsIgnoreCase(str1);
//		System.out.println(equing);
//		}

		System.out.println("Check ContentEquals");
		System.out.println(str.contentEquals(str4));
		System.out.println(str1.contentEquals(str2));

		System.out.println("Check compareTo");
		System.out.println(str.compareTo(str4));
		System.out.println(str5.compareTo(str6));

	}

}
