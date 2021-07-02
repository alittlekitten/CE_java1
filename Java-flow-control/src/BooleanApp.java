
public class BooleanApp {

	public static void main(String[] args) {
		
		System.out.println("One"); // string
		System.out.println(1); // number(int)
		System.out.println(true);
		System.out.println(false);
		
		String foo = "Hello world";
		// String true = "Hello world"; // true와 false는 변수 이름으로 쓸 수 없다
		// reserved word는 컴퓨터에서 이미 사용하고 있거나 앞으로 사용할 수 있는 단어!! 그래서 혼동을 막기 위해 변수로 사용할 수 없다!
		
		System.out.println(foo.contains("world")); // contains는 String안에 매개변수가 있으면 true 없으면 false
		System.out.println(foo.contains("wow")); // 없으니까 false

	}

}
