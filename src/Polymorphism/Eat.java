package Polymorphism;

public class Eat {

	public static void main(String[] args) {
		Food[] yum = new Food[3];
		yum [0]= new Pizza();
		yum[1]= new Wings();
		yum[2]= new Food();
		
		for(int x=0;x<3;x++) {
			yum[x].eat();
		}
		
	}

}
