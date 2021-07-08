interface Calculable{
	double PI = 3.14; // 인터페이스에는 변수의 실제 값이 들어간다!
	int sum(int v1, int v2);
}

interface Printable{ // 인터페이스의 이름은 대문자로 시작, 형용사 형태의 이름
	void print();
}

class RealCal implements Calculable, Printable{ // 하나의 클래스에 여러 interface 구현 가능!
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is RealCal!!");
	}
}

class DummyCal implements Calculable{ // 인터페이스가 규제하고 있는 형태를 엄수해야만 정상적으로 동작
	public int sum(int v1, int v2) {
		return 3;
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		// 더하기 기능이 있는 클래스를 만들어주세요.
		Printable c = new RealCal();
//		System.out.println(c.sum(2, 1)); // 3
		c.print();
//		System.out.println(c.PI); // 3.14
	}

}
  
