package superr.keyword;
class Animal{
	String color="black";
}
class og extends Animal{
	String color="white";
	void display()
	{
		System.out.println("dog colour is:"+color);
		System.out.println("Animal color is:"+(super.color));
	}
}

public class TestSuper1 {
public static void main(String[] args) {
		

	}

}
