package keywordThis;

public class CurrentClassInstance {
	CurrentClassInstance a()
	{
		return this;
	}
	void display()
	{
		System.out.println("hello java");
		}

	public static void main(String[] args) {
		new CurrentClassInstance(). a().display();

	}

}
