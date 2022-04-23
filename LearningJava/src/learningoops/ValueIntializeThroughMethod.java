package learningoops;

class ValueIntializeThroughMethod {
int rollno;
String name;

void insertRecord(int r,String s)
{
rollno=r;
name=s;
}
void displayInformation()
{
System.out.println(rollno+" "+name);	
}
class TestStudent
{
public static void main(String[] args) {
	ValueIntializeThroughMethod s1=new ValueIntializeThroughMethod();
	s1.insertRecord(1403331169, "Vinay kumar yadav");
	s1.displayInformation();

	}
}
}


