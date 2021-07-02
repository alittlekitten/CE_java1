
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // double형 변수에 int형 데이터를 넣었는데 오류가 나지 않는다! - 손실되는 정보 없이 double로 자동 변환
		double b2 = (double) 1; // 수동으로 바꿔준 것!!
		System.out.println(b);
		
//		int c = 1.1; // int형 변수에 double형 데이터를 넣으면 오류 발생! - 손실되는 정보가 있다!
		// 빨간 밑줄에 마우스를 올려보면 바꿀 수 있는 방법 2가지를 알려준다!
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e); // 1.1을 1로 casting해서 1 출력
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
	}

}
