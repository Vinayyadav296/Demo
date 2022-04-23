package runtime.polymorphism;
class Bank{
	float getRateOfInterest()
	{
		return(0);
	}
}
class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return(7.1f);
	}

}
class BOI extends Bank{
	float getRateOfInterest()
	{
		return(8.1f);
	}

}
class SBI extends Bank{
	float getRateOfInterest()
	{
		return(9.5f);
	}

}
public class TestPolymorphism1 {

	public static void main(String[] args) {
		Bank b;
		b=new ICICI();
	System.out.println("ICICI interest rate is:"+b.getRateOfInterest());
      b=new BOI();
      System.out.println("BOI interest rate is:"+b.getRateOfInterest());
      b=new SBI();
      System.out.println("SBI interest rate is:"+b.getRateOfInterest());
  
	}

}
