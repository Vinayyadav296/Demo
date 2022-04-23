package keywordThis;

public class CallingDefaultconstCurrentClassCont {
	CallingDefaultconstCurrentClassCont()
	{
		System.out.println("Hello dear");
	}
	CallingDefaultconstCurrentClassCont(int x)
	{
		this();
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		CallingDefaultconstCurrentClassCont c1=new CallingDefaultconstCurrentClassCont(100);

	}

}
