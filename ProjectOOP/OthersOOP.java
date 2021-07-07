import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		// 1회용 작업 : 클래스에 소속된 메소드를 사용
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		// 긴 맥락을 가진 작업의 경우 클래스를 복제해서 사용
		FileWriter f1 = new FileWriter("data.txt"); // data.txt라는 파일에 데이터를 저장하겠다는 상태를 가진 인스턴스가 f1
		f1.write("Hello");
		f1.write(" Java");
		
		
		FileWriter f2 = new FileWriter("data2.txt"); // f1과는 다른 복제본 : 데이터는 data2.txt에 저장된다
		f2.write("Hello");
		f2.write(" Java");
		f2.close();
		
		f1.write("!!!");
		f1.close();
	}

}
