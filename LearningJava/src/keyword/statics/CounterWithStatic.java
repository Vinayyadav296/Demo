package keyword.statics;

public class CounterWithStatic {
static int count=0;
void display()
{
	count++;
	System.out.println(count);
}
public static void main(String[] args) {
	CounterWithStatic c1=new CounterWithStatic();
	CounterWithStatic c2=new CounterWithStatic();
	CounterWithStatic c3=new CounterWithStatic();
	c1.display();
	c2.display();
	c3.display();

	}

}
