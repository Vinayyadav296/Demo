package learningoops;
class AnonymousObject {
void fact(int n)
{
	int factorial=1;
	for(int i=1;i<=n;i++)
	{
		factorial=factorial*i;
	}
	System.out.println("Factorial is"+" "+factorial);
}
	public static void main(String[] args) {
	new AnonymousObject().fact(5);
	}

}
