package method.overriding;
class A1{
	A1 foo()
	{
		return this;
	}
	void print()
	{
		System.out.println("enter in class a1");
	}
}
class A2 extends A1{
	A2 foo()
	{
		return this;
	}
	void print()
	{
		System.out.println("enter in class a2");
	}
}
class A3 extends A2{
	A3 foo()
	{
		return this;
	}
	void print()
	{
		System.out.println("enter in class a3");
	}
}
public class CovariantReturnType1 {
public static void main(String[] args) {
		A1 a=new A1();
		A2 b=new A2();
		A3 c=new A3();
		a.foo().print();
		b.foo().print();
		c.foo().print();
	}

}
