package Abstraction;

public class TestPhone {

	public static void main(String[] args) {
		Phone phone = new Iphone();
		phone.turnon();
		phone.turnoff();
		
		Iphone xs = new Iphone();
		xs.batterylife();
		xs.smartphone();
		xs.sixtyfourgbmemory();;
		
		Smartphone apple = new Iphone();
		apple.connections();
		
	

	}
}
