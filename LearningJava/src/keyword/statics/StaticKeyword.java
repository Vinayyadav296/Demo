package keyword.statics;

public class StaticKeyword {
int rollno;
String name;
static String collegename="Rkgit"; 
StaticKeyword(int r,String s)
{
rollno=r;
name=s;
}
void display()
{
System.out.println(rollno+" "+name+" "+collegename);
}
	public static void main(String[] args) {
		StaticKeyword s1=new StaticKeyword(1403331168,"vikrant tomar");
		StaticKeyword s2=new StaticKeyword(1403331169,"Vinay yadav");
		s1.display();
		s2.display();
}

}
