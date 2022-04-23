package Array;

public class CloneArray {

	public static void main(String[] args) {
		int []arr= {35,45,98,56};
		System.out.println("printing original array"); 
		for(int i:arr)
			System.out.println(i);
		System.out.println("printing cloning of array:");
		int carr[]=arr.clone();
			for(int i:arr)
				System.out.println(i);
			System.out.println("are both equal?");
			System.out.println(arr==carr);
	
	}

}
