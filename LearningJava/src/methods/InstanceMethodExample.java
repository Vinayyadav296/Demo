package methods;

public class InstanceMethodExample {

public static void main(String[] args) {
	InstanceMethodExample c=new InstanceMethodExample();
	System.out.println("sum of two number is"+" "+c.sum(198,132));

	}
public int sum(int a,int b)
{
int c=a+b;
return c;
}
}
