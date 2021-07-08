class Cal11{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int sum(int v1, int v2, int v3) { // 오버로딩 (Overloading)
		return this.sum(v1, v2)+v3;
	}
}

class Cal2{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int minus(int v1, int v2) {
		return v1-v2;
	}
}

class Cal33 extends Cal11{ // Cal 클래스를 확장한다
	public int sum(int v1, int v2) { // 덮어쓰기 (Overriding) - v1: 2, v2: 1
		System.out.println("Cal3!!");
		return super.sum(v1, v2);
	}
	public int minus(int v1, int v2) { // 추가하기
		return v1-v2;
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		
		Cal11 c = new Cal11();
		System.out.println(c.sum(2, 1)); // 3
		System.out.println(c.sum(2, 1, 1)); // 4
		
		Cal33 c3 = new Cal33();
		System.out.println(c3.sum(2, 1)); // "Cal3!!" 3
		System.out.println(c3.minus(2, 1)); // 1
	}

}
