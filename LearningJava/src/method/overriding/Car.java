package method.overriding;
class vehicle{
	void run()
	{
		System.out.println("vehicle is Runninng");
	}
}

class Car extends vehicle {
      void run()
      {
    	System.out.println("car is running");
      }
	public static void main(String[] args) {
	Car c=new Car();
    c.run();
	}

}
