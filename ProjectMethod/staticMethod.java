class Print{
	public String delimiter; // t1의 delimiter의 값이 "-"가 되면 이 delimiter도 "-"가 된다
	
	public void a() { // 메소드가 인스턴스의 소속일 때에는 static을 빼 줘야 한다!
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}

	public void b() { // 메소드가 인스턴스의 소속일 때에는 static을 빼 줘야 한다!
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}

public class staticMethod {

	public static void main(String[] args) {
//		Print.a("-"); // Print라는 클래스의 소속으로 실행중
//		Print.b("-");
		
		// instance
		Print t1 = new Print(); // t1은 Print의 분신(instance)
		t1.delimiter = "-"; // t1이라는 인스턴스의 소속으로 실행중
		t1.a();
		t1.b();
		
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print(); // t2은 Print의 분신(instance)
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}


}
