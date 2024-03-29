import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null; // null은 값이 없다
		// try catch finally
		try {
			f = new FileWriter("data.text");
			f.write("Hello");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 합니다.
			// 만약 f가 null이 아니라면
			if(f != null) {
				try {
					f.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}
