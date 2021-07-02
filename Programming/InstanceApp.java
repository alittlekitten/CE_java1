import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; 

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		p2.toString(); // Object의 메소드도 사용 가능!

		int x = 3;
		System.out.println(x);
	}

}
