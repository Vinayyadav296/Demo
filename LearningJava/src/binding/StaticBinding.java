package binding;

public class StaticBinding {
    private void eat()
    {
    	System.out.println("dog is eating");
    }
	public static void main(String[] args) {
		StaticBinding s=new StaticBinding();
		s.eat();

	}

}
