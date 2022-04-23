package method.oveloading;

public class MethodOverloadingByArgument {
     static int add(int a,int b)
     {
    	int c=a+b;
    	return c;
     }
     static int add(int l,int m,int n)
     {
    	 int o=l+m+n;
    	 return o;
     }
	public static void main(String[] args) {
		System.out.println(add(10,25));
        System.out.println(add(395,482,89));  
	}

}
