package abstraction;
abstract class Bike{
	Bike(){
		System.out.println("bike is created");
	}
	abstract void run();
	void gear()
	{
		System.out.println("gear is engaged");
	}
}
class Honda extends Bike{
	void run()
	{
		System.out.println("bike is running");
	}
}
public class TestAbstraction {

	public static void main(String[] args) {
		Bike b=new Honda();
		b.run();
		b.gear();

	}

}
