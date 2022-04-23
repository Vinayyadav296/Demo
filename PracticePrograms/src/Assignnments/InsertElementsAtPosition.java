package Assignnments;

public class InsertElementsAtPosition {
      /*public void insertAtStart(int arr[],int val) {
    	  for(int i=arr.length-1;i>0;i--) {
    		  arr[i]=arr[i-1];
    	  }
    	  arr[0]=val;
      }*/
     public void insertAtPosition(int arr[],int pos,int val) {
    	 for(int i=arr.length-1;i>pos;i--) {
    		 arr[i]=arr[i-1];
    	 }
    	 arr[pos]=val;
     }
      public void printArray(int arr[]) {
    	  for(int i=0;i<arr.length;i++)
    	  System.out.print(arr[i]+" ");
      }
	public static void main(String[] args) {
		InsertElementsAtPosition obj=new InsertElementsAtPosition();
		int arr[]=new int[] {10,20,30,40,50};
		//obj.insertAtStart(arr, 45);
		//obj.printArray(arr);
		System.out.println();
		obj.insertAtPosition(arr, 4, 55);
		obj.printArray(arr);

}
}
