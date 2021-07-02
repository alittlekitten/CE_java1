
public class AuthApp3 {

	public static void main(String[] args) {
		
//		String[] users = {"egoing", "ssoco", "youbin"};
		String[][] users = {
				{"egoing", "1111"},
				{"ssoco", "2222"},
				{"youbin", "3333"}
		};
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false; // 로그인이 됐는지 확인하는 변수
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(
					current[0].equals(inputId) &&
					current[1].equals(inputPass)
			) {
				isLogined = true;
				break; // break를 만나면 반복문을 종료!
			}
		}
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you?");
		}
		
	}

}
