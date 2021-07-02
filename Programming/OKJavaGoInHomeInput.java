import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHomeInput {

	public static void main(String[] args) {

		String id = args[0];
		String bright = args[1];
		
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
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright)); // 10�� ���� �Ѱڴ�! - �Է°��� string�̹Ƿ� double������ �ٲ���� �Ѵ�!
		moodLamp.on();
	}

}
