class Print{
	public String delimiter; // t1�� delimiter�� ���� "-"�� �Ǹ� �� delimiter�� "-"�� �ȴ�
	
	public void a() { // �޼ҵ尡 �ν��Ͻ��� �Ҽ��� ������ static�� �� ��� �Ѵ�!
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}

	public void b() { // �޼ҵ尡 �ν��Ͻ��� �Ҽ��� ������ static�� �� ��� �Ѵ�!
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
//		Print.a("-"); // Print��� Ŭ������ �Ҽ����� ������
//		Print.b("-");
		
		// instance
		Print t1 = new Print(); // t1�� Print�� �н�(instance)
		t1.delimiter = "-"; // t1�̶�� �ν��Ͻ��� �Ҽ����� ������
		t1.a();
		t1.b();
		
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print(); // t2�� Print�� �н�(instance)
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}


}
