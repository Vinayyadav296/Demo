package constructors;

public class CopyConstructor {
	int id;
	String name;
	CopyConstructor(int a,String b)
	{
		id=a;
		name=b;
	}
	CopyConstructor(CopyConstructor s)
	{
		id=s.id;
		name=s.name;
	}
	void display()
	{
	System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
    CopyConstructor c1=new CopyConstructor(149,"Vinay yadav");
    CopyConstructor c2=new CopyConstructor(c1);
    c1.display();
    c2.display();
    }

}
