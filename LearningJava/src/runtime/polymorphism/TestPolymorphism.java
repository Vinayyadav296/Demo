package runtime.polymorphism;
class Bike{
	void run()
	{
		System.out.println("running...");
	}
}
class Splendor extends Bike{
	void run(){
	System.out.println("bike is runing at 40km per hour..");
}
}
	

public class TestPolymorphism {

	public static void main(String[] args) {
		Bike b=new Splendor();
		b.run();

	}

}
