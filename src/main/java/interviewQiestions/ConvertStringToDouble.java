package interviewQiestions;

public class ConvertStringToDouble {
public static void main(String[] args) {
	String str = "30,000";
	str = str.replace(",","");
//	Double str1 = Double.parseDouble(str); 
//	Double str1 = Double.valueOf(str); 
	Double str1 = new Double(str); 
	System.out.println(str1);
}
}