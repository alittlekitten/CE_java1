
public class ArrayApp {

	public static void main(String[] args) {
		
		// egoing, ssoco, youbin
//		String users = "egoing, ssoco, youbin"; // �̷��� ������ �� �ְ�����, �����ϴ�!
		String[] users = new String[3]; // �� 3���� ���� ���̴�! (���� �����Ͱ� ���� ���� �迭 ����)
		users[0] = "egoing"; // ��ǻ�ʹ� 0���� ī�����Ѵ�!
		users[1] = "ssoco";
		users[2] = "youbin";
		
		System.out.println(users[1]); // ssoco ���
		System.out.println(users.length); // 3 : �� ĭ¥�� �迭�̴�
		
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]); // 100
		System.out.println(scores.length); // 3
		
	}

}
