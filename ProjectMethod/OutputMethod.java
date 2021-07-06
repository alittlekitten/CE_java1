
public class OutputMethod {

	public static String a() { // output이 String이다
		// ...
		return "a";
	}
	
	public static int one() { // output이 int이다
		return 1;
	}
	
	public static void main(String[] args) { // void는 리턴값이 없다

		System.out.println(a());
		System.out.println(one());

	}

}
