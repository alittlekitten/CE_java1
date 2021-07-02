
public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		int i = 0; // 일반적으로 i는 반복문을 위한 변수
		while(i < 3) {
			System.out.println(2);
			System.out.println(3);
//			i = i + 1; // i의 값을 1씩 증가시킨다
			i++; // 이것도 같다!
		}
		System.out.println(4);

		for(int j = 0; j < 3; j++) {
			System.out.println(2);
			System.out.println(3);
		}
		
	}

}
