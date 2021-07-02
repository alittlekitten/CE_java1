
public class ArrayApp {

	public static void main(String[] args) {
		
		// egoing, ssoco, youbin
//		String users = "egoing, ssoco, youbin"; // 이렇게 관리할 수 있겠지만, 불편하다!
		String[] users = new String[3]; // 값 3개를 넣을 것이다! (아직 데이터가 없는 깡통 배열 생성)
		users[0] = "egoing"; // 컴퓨터는 0부터 카운팅한다!
		users[1] = "ssoco";
		users[2] = "youbin";
		
		System.out.println(users[1]); // ssoco 출력
		System.out.println(users.length); // 3 : 세 칸짜리 배열이다
		
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]); // 100
		System.out.println(scores.length); // 3
		
	}

}
