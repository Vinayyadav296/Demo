package keywordThis;

public class ConstructorCallConstructor {
	int rollno; 
	String name,course;
	float fees;
	ConstructorCallConstructor(int rollno,String name,String course)
	{
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	ConstructorCallConstructor(int rollno,String name,String course,float fees)
	{
	this(rollno,name,course);
	this.fees=fees;
	}
	void display()
	{
	 System.out.println(rollno+" "+name+" "+course+" "+fees);
	}
	public static void main(String[] args) {
		 ConstructorCallConstructor c1 =new  ConstructorCallConstructor(14,"vinay","B.tech");	
		 ConstructorCallConstructor c2=new  ConstructorCallConstructor(14,"vinay","B.tech",145000);
		 c1.display();
		 c2.display();
                
	}

}
