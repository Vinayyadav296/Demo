package keyword.statics;

public class CubeCalculation {
	static int cube(int x)
	{
	  return x*x*x ;
	}

	public static void main(String[] args) {
	int c=CubeCalculation.cube(5);
	System.out.println(c);

	}

}
