package superr.keyword;
class Animal1 {
	void eat()
	{
		System.out.println("Animal is eating");
}
}
class Dog1 extends Animal1{
	void eat() {
		System.out.println("Dog is Eating");
	}
	void bark()
	{
		System.out.println("dog is barking");
	}
	void display()
	{
		super.eat();
		bark();
	}
}
public class TestSuper2 {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		d.display();
	

	}

}
