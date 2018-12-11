package Abstraction;

public abstract class Smartphone implements Phone {

		public void turnon () {
			System.out.println("You can turn on the phone by holding the power button down until screen comes up");
		}
		public void turnoff() {
			System.out.println("This phone will turn off when you hold the power button down");	
		}

		public void connections() {
			System.out.println("This phone runs on 4G connection");

		}
		public abstract void sixtyfourgbmemory();
}
