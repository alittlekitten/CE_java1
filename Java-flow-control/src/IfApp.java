
public class IfApp {

	public static void main(String[] args) {
		
		System.out.println("a");
		
//		if(true) { // 괄호 안의 값이 true면 중괄호 안의 코드가 실행된다! false면 실행이 되지 않겠죠!
//			System.out.println(1);
//		} else {
//			if(true) {
//				System.out.println(2);
//			} else {
//				System.out.println(3);
//			}
//		}
		
		if(false) {
			System.out.println(1);
		} else if(true) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
		System.out.println("b");
		
	}

}
