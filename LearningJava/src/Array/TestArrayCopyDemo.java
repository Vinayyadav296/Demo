package Array;

public class TestArrayCopyDemo {

	public static void main(String[] args) {
		char [] source= {'a','d','o','g','e','m'};
        char [] destination=new char[3];
        System.arraycopy(source,1,destination,0,3);
        System.out.println(String.valueOf(destination));
	}

}
