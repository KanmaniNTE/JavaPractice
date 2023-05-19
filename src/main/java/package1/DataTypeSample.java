package package1;

public class DataTypeSample {
	private int b = 100;
	protected int c = 20;
	public int d = 15;

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
//	System.out.println(b);
//	System.out.println(c);
//	System.out.println(d);
		DataTypeSample obj =new DataTypeSample();
		System.out.println(obj.b);

	}

}
