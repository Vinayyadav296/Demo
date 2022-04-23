package learningoops;
class AreaOfRectangle {
	int length;
	int breadth;
void insertDimensions(int a,int b)
{
	length=a;
	breadth=b;
}
void area()
{
	System.out.println("Area of rectangle"+" "+length*breadth);
}
class RectanglularArea
{
	public static void main(String[] args) {
		AreaOfRectangle a1=new AreaOfRectangle();
		AreaOfRectangle a2=new AreaOfRectangle();
		a1.insertDimensions(143,258);
		a1.area();
		a2.insertDimensions(149,251);
		a2.area();  
}
}
}