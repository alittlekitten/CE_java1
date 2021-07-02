import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHome {

	public static void main(String[] args) {

		String id = "JAVA APT 507"; // �ߺ� ����
		
		// Elevator call
		Elevator myElevator = new Elevator(id); // �ڹ� ����Ʈ�� �ִ� ���������Ͱ� new Elevator("JAVA APT 507")�� �ȴ�!
														   // myElevator�� Elevator�̶�� �����͸� �� �� �ִ�!
		myElevator.callForUp(1); // 1������ ���������� ������!
		
		// Security off
		Security mySecurity = new Security(id); // �ڹ� ����Ʈ�� ������ �����Ѵ�
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp"); // 507ȣ�� �Ž� ������ �������� ����
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + "/ floorLamp"); // 507ȣ�� �ٴ� ������ �������� ����
		floorLamp.on();
	}

}
