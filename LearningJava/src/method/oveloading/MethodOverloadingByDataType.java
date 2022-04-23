package method.oveloading;

public class MethodOverloadingByDataType {

    static int add(int a,int b)
    {
   	int c=a+b;
   	return c;
    }
    static double add(double l,double m)
    {
   	 double o=l+m;
   	 return o;
    }
	public static void main(String[] args) {
		System.out.println(add(10,25));
       System.out.println(add(395,482));  
	}
    }


