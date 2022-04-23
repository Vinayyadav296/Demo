package superr.keyword;
class A
{
A(){
	System.out.println("parent class constructor is called ");
}
}
class B extends A{
	B()
	{
	super();
	System.out.println("child class constructor is called");
	}
	B(int a){
		super ();
		System.out.println("child class construcotr is called"+":"+a);
	}
}
public class InstanceInitializer {

	public static void main(String[] args) {
	B b=new B();
	B b1=new B(10);

	}

}
