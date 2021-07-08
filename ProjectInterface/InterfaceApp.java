interface Calculable{
	double PI = 3.14; // �������̽����� ������ ���� ���� ����!
	int sum(int v1, int v2);
}

interface Printable{ // �������̽��� �̸��� �빮�ڷ� ����, ����� ������ �̸�
	void print();
}

class RealCal implements Calculable, Printable{ // �ϳ��� Ŭ������ ���� interface ���� ����!
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is RealCal!!");
	}
}

class DummyCal implements Calculable{ // �������̽��� �����ϰ� �ִ� ���¸� �����ؾ߸� ���������� ����
	public int sum(int v1, int v2) {
		return 3;
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		// ���ϱ� ����� �ִ� Ŭ������ ������ּ���.
		Printable c = new RealCal();
//		System.out.println(c.sum(2, 1)); // 3
		c.print();
//		System.out.println(c.PI); // 3.14
	}

}
  
