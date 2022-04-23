abstract class Janwar {
	abstract void walk();
     Janwar(){
    	 System.out.println("Janwar is created");
     }
	void breathe() {
		System.out.println("animal is breathing");
	}
}

class Horse extends Janwar {
	Horse(){
		System.out.println("horse is created");
	}
	void walk() {
		System.out.println("horse is walking on 4 legs");
	}
}

class Chicken extends Janwar {
	Chicken(){
		System.out.println("Chicken is created");
	}
	void walk() {
		System.out.println("chicken is walking on 2 legs");
	}
}

public class StaticMethod1 {
	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
		horse.breathe();

	}
}