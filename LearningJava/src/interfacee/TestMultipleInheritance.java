package interfacee;
interface Printable{
	void print();
	}
interface Showable{
	void show();
}
class TestMultipleInheritance implements Printable,Showable {
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
