
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // double�� ������ int�� �����͸� �־��µ� ������ ���� �ʴ´�! - �սǵǴ� ���� ���� double�� �ڵ� ��ȯ
		double b2 = (double) 1; // �������� �ٲ��� ��!!
		System.out.println(b);
		
//		int c = 1.1; // int�� ������ double�� �����͸� ������ ���� �߻�! - �սǵǴ� ������ �ִ�!
		// ���� ���ٿ� ���콺�� �÷����� �ٲ� �� �ִ� ��� 2������ �˷��ش�!
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e); // 1.1�� 1�� casting�ؼ� 1 ���
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	}

}
