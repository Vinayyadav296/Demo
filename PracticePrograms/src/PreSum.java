
public class PreSum {
  public static void main(String[] args) {
	int arr[]=new int[] {0,6, 3, -2, 4, -1, 0, -5};
	int pf[]=new int[arr.length];
	for(int i=1;i<=pf.length;i++) {
		pf[i]=pf[i-1]+arr[i];
		System.out.print(pf[i]+" ");
	}
}
}
