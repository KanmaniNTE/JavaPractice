package arrayPracice;

public class findTheGivenValuePresentInArray {
	int c[] = { 10, 20, 30, 40, 50, 60 };
	int b = 70;
	boolean givenValue= false;

	public static void main(String[] args) {
		findTheGivenValuePresentInArray obj = new findTheGivenValuePresentInArray();
		obj.findGivenValuePresent(obj.c);
	}

	public void findGivenValuePresent(int arr[]) {

		System.out.println("The Array Values are :");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] == b) {
			 givenValue = true;
				break;
			}
		}
		if (givenValue==true) {
			System.out.println("Given Value present in Array");
		}else {
			System.out.println("Given Value not present in Array");
		}

	}

	

}
