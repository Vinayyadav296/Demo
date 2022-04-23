package keyword.statics;

public class CounterWithoutStatic {
	int count=0;
	void display()
	{
	 count++;
	 System.out.println(count);
	}

	public static void main(String[] args) {
		CounterWithoutStatic c1=new CounterWithoutStatic();
		CounterWithoutStatic c2=new CounterWithoutStatic();
		CounterWithoutStatic c3=new CounterWithoutStatic();
		c1.display();
		c2.display();
		c3.display();
	}
}
