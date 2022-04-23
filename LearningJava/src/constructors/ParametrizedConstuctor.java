package constructors;

public class ParametrizedConstuctor {
    int id ;
    String name;
    ParametrizedConstuctor(int i,String n)
    {
    	id=i;
    	name=n;
    }
    void display()
    {
    System.out.println(id+" "+name);
    }
	public static void main(String[] args) {
		ParametrizedConstuctor p1=new ParametrizedConstuctor(1403331169,"Vinay kumar yadav");
		ParametrizedConstuctor p2=new ParametrizedConstuctor(1403331168,"Vikrant tomar");
	p1.display();
	p2.display();
	}

}
