package inheritance;
class Employee {
	float salary=40000;
	public static void main(String[] args) {
		Programmer p=new Programmer();
		System.out.println("bonus is"+p.bonus);
		System.out.println("salary is"+p.salary);

	}
}
 class Programmer extends Employee
{
	int bonus=10000;

	}


