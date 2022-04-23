package constructors;

public class WithoutCopyConstructor {
    int id;
    String name;
    WithoutCopyConstructor(int a,String b)
    {
    	id=a;
    	name=b;
    }
    WithoutCopyConstructor()
    {
    	
    }
    void display()
    {
    System.out.println(id+" "+name);
    }
	public static void main(String[] args) {
		WithoutCopyConstructor c1=new WithoutCopyConstructor(111,"vinay");
		WithoutCopyConstructor c2=new WithoutCopyConstructor();
		c2.id=c1.id;
		c2.name=c1.name;
		c1.display();
		c2.display();

	}

}
