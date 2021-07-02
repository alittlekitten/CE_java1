import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoInHome {

	public static void main(String[] args) {

		String id = "JAVA APT 507"; // 중복 제거
		
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
	}

}
