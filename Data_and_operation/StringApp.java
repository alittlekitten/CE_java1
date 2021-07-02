
public class StringApp {

	public static void main(String[] args) {
		
		// Character vs String
		System.out.println("Hello World"); // String - Character들의 모임
		System.out.println('H'); // Character - 한 글자
		System.out.println("H"); // String - ", '는 다르다!!
		
		System.out.println("Hello " 
				+ "World"); // 줄바꿈을 할 때는 " "를 이용해서 나눠준 후 더해야한다!
		
		// new line
		System.out.println("Hello \nWorld"); // \n은 줄넘김 기호!
		
		// escape (어떤 임무가 있는 문자를 일시적으로 일반 문자로 바꿔주는 역할)
		System.out.println("Hello \"World\""); // \(역슬래시)는 특수한 문자가 아닌 일반 문자열임을 알려주기 위한 예외처리

	}

}
