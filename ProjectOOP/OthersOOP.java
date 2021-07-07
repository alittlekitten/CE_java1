import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		// 1ȸ�� �۾� : Ŭ������ �Ҽӵ� �޼ҵ带 ���
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		// �� �ƶ��� ���� �۾��� ��� Ŭ������ �����ؼ� ���
		FileWriter f1 = new FileWriter("data.txt"); // data.txt��� ���Ͽ� �����͸� �����ϰڴٴ� ���¸� ���� �ν��Ͻ��� f1
		f1.write("Hello");
		f1.write(" Java");
		
		
		FileWriter f2 = new FileWriter("data2.txt"); // f1���� �ٸ� ������ : �����ʹ� data2.txt�� ����ȴ�
		f2.write("Hello");
		f2.write(" Java");
		f2.close();
		
		f1.write("!!!");
		f1.close();
	}

}
