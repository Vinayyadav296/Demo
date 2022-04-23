package method.oveloading;

public class MethodOverloadingWithTypePromotion {
	void sum(int a,long b)
	{
		System.out.println("sum of two numbers:"+(a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("sum of two numbers:"+" "+(a+b+c));
	}


	public static void main(String[] args) {
		MethodOverloadingWithTypePromotion p=new MethodOverloadingWithTypePromotion();	
        p.sum(10,20);
        p.sum(31,32,89);
        }

}
