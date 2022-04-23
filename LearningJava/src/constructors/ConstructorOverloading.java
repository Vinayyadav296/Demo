package constructors;

public class ConstructorOverloading {
	int id;
	String name;
	float salary;
	ConstructorOverloading(int n,float m)
	{
		id=n;
		salary=m;
	}
	ConstructorOverloading(int a,String b,float c)
	{
	 id=a;
	 name=b;
	 salary=c;
	}
	void display1()
	{
	 System.out.println("Student id is"+" "+id+" "+"Student salary is"+salary);
	 
	}
    void display2()
    {
    	System.out.println("Student id is"+" "+id+" "+"Student salary is"+salary+" "+"Student name is "+name);
    }
	public static void main(String[] args) {
		ConstructorOverloading m1=new ConstructorOverloading(149,50000);
		ConstructorOverloading m2=new ConstructorOverloading(354,"Vinay kumar yadav",41950);
		m1.display1();
		m2.display2();
				

	}

}
