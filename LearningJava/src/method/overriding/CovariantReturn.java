package method.overriding;
class A{
	A getA()
	{
		return this;
	}
}
class B extends A{
B getB()
{
return this;
}

void display()
{
	System.out.println("welcome to covariant return type");
}

public class CovariantReturn {

	public static void main(String[] args) {
		new B().getB().display();

	}

}
}
