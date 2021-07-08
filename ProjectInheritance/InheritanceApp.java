class Cal11{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int sum(int v1, int v2, int v3) { // �����ε� (Overloading)
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

class Cal33 extends Cal11{ // Cal Ŭ������ Ȯ���Ѵ�
	public int sum(int v1, int v2) { // ����� (Overriding) - v1: 2, v2: 1
		System.out.println("Cal3!!");
		return super.sum(v1, v2);
	}
	public int minus(int v1, int v2) { // �߰��ϱ�
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
