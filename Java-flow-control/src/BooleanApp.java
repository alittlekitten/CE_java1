
public class BooleanApp {

	public static void main(String[] args) {
		
		System.out.println("One"); // string
		System.out.println(1); // number(int)
		System.out.println(true);
		System.out.println(false);
		
		String foo = "Hello world";
		// String true = "Hello world"; // true�� false�� ���� �̸����� �� �� ����
		// reserved word�� ��ǻ�Ϳ��� �̹� ����ϰ� �ְų� ������ ����� �� �ִ� �ܾ�!! �׷��� ȥ���� ���� ���� ������ ����� �� ����!
		
		System.out.println(foo.contains("world")); // contains�� String�ȿ� �Ű������� ������ true ������ false
		System.out.println(foo.contains("wow")); // �����ϱ� false

	}

}
