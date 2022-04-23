package interfacee;
interface Printable1{
	void print();
	}
interface Showable1 extends Printable{
	void show();
}
class TestInterfaceInheritance implements Printable1,Showable1 {
	public void print()
	{
		System.out.println("hello");
	}
public void show()
{
System.out.println("Namaste");	
}
	public static void main(String[] args) {
		TestMultipleInheritance a=new TestMultipleInheritance();
	a.print();
	a.show();

	}

}


