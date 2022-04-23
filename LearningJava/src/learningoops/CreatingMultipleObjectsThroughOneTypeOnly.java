package learningoops;
class CreatingMultipleObjectsThroughOneTypeOnly {
int length;
int breadth;
void area(int l,int b)
{
length=l;
breadth=b;
}
void displayArea()
{
System.out.println("Area of reactangle"+" "+length*breadth);
}

class testRectangle{
public static void main(String[] args) 
{
CreatingMultipleObjectsThroughOneTypeOnly a1=new CreatingMultipleObjectsThroughOneTypeOnly(),a2=new CreatingMultipleObjectsThroughOneTypeOnly();
a1.area(53,69);
a1.displayArea();
a2.area(39,78);
a2.displayArea();
	}

}
}
