package keyword.statics;

public class StaticMethod {
	int id;
	String name;
	static String college="ITS";
	static void change()
	{
		college="Rkgit";
	}
	StaticMethod(int r,String s)
	{
		id=r;
		name=s;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		StaticMethod.change();
		StaticMethod m1=new StaticMethod(149,"vinay");
		StaticMethod m2=new StaticMethod(148,"vijay");	
		m1.display();
		m2.display();

	}

}
