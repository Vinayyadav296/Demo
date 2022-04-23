package inheritance;

public class Animal {
void eat()
{
	System.out.println("Animal is eating");
}
public static void main(String[] args) {
	Dog d=new Dog();
	d.bark();
	d.eat();
}
}
class Dog extends Animal
{
	void bark()
	{
	 System.out.println("Dog is barking ");
}
}

	

	






