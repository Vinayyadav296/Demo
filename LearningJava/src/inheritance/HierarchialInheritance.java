package inheritance;
class TestInheritance{
	void animal()
	{
		System.out.println("Animal is eating");
	}
}
class TestInheritance1 extends TestInheritance {
	void dog()
	{
		System.out.println("Dog is barking");
	}
}
class HierarchialInheritance extends TestInheritance{
	void cat()
	{
		System.out.println("Cat is weeping");
	}

	public static void main(String[] args) {
		HierarchialInheritance h=new HierarchialInheritance();
		h.animal();
		h.cat();
	

	}

}
