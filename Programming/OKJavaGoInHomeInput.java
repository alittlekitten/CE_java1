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
		Elevator myElevator = new Elevator(id); // 자바 아파트에 있는 엘리베이터가 new Elevator("JAVA APT 507")이 된다!
														   // myElevator는 Elevator이라는 데이터만 올 수 있다!
		myElevator.callForUp(1); // 1층으로 엘리베이터 보내라!
		
		// Security off
		Security mySecurity = new Security(id); // 자바 아파트의 보안을 해제한다
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp"); // 507호의 거실 램프가 켜지도록 설정
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + "/ floorLamp"); // 507호의 바닥 램프가 켜지도록 설정
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright)); // 10의 밝기로 켜겠다! - 입력값은 string이므로 double형으로 바꿔줘야 한다!
		moodLamp.on();
	}

}
