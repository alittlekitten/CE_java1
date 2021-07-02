
public class AuthApp2 {

	public static void main(String[] args) {
		
		String id = "ssoco";
		String inputId = args[0];
		
		String pass1 = "1111";
		String pass2 = "2222";
		String inputPass = args[1];
		
		System.out.println("Hi!");
		
//		//if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)) {
//				System.out.println("Master!");
//			} else {
//				System.out.println("Wrong password!");
//			}
//		} else {
//			System.out.println("Who are you?");
//		}
		
		boolean isRightPass = (inputPass.equals(pass1) || (inputPass.equals(pass2)));
		if(inputId.equals(id) && isRightPass) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
		

	}

}
