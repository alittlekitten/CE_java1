import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null; // null�� ���� ����
		// try catch finally
		try {
			f = new FileWriter("data.text");
			f.write("Hello");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// close�� �ϱ� ���� ���ܰ� �߻��� �� �ֱ� ������ finally�� ó���ؾ� �մϴ�.
			// ���� f�� null�� �ƴ϶��
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
