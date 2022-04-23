package keywordThis;

public class UseThisKeyword {
	int id;
	String name;
	UseThisKeyword(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
    void display()
    {
    	System.out.println(id+" "+name);
    }
	public static void main(String[] args) {
		UseThisKeyword u1=new UseThisKeyword(1403331169,"vinay");
		u1.display();

	}

}
