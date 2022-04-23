package methods;
public class GettersSetters {
	private int rollno =1403331169;
	private String name="Vinay kumar yadav";
	public int getRoll()
	{
		return rollno;
	}
	public void setRoll(int rollno)
	{
		this.rollno=rollno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
   void display()
   {
	   System.out.println("Roll number is"+" "+rollno);
	   System.out.println("Name of Candidate is"+"  "+name);
   }
	public static void main(String[] args) {
		
		GettersSetters s=new GettersSetters();
		s.display();
	}

}
