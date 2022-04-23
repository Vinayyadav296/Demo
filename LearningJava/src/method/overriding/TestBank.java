package method.overriding;
class Bank{
	int getRateOfInterest()
	{
		return 0;
	}
}
	
  class SBI extends Bank{
	  int getRateOfInterest()
	  {
		  return(8);
	  }
  }
  class ICICI extends Bank {
	  int getRateOfInterest()
	  {
		  return(7);
	  }
  }
  class BOI extends Bank{
	  int getRateOfInterest()
	  {
		  return(6);
	  }
  }



class TestBank {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		BOI b=new BOI();
	    System.out.println("SBI rate of interest is:"+s.getRateOfInterest());
	    System.out.println("ICICI rate of interest is:"+i.getRateOfInterest());
	    System.out.println("BOI rate of interest is:"+b.getRateOfInterest());
	}
}


