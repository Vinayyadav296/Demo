package Array;

public class AddingArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{9,10,11},{12,13,14},{15,16,117}};
		int c[][]=new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(c[i][j]=a[i][j]+b[i][j]);
			}
			System.out.println();
		}

	}

}
