package Assignnments;

import java.util.HashMap;

public class SubArraySummm {
	public void subArraySum(int arr[],int sum) {
		int currentsum=0;
		int start=0;
		int end=-1;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			currentsum+=arr[i];
			if(currentsum-sum==0) {
				start=0;
				end=i;
				break;
			}
			if(map.containsKey(currentsum-sum)) {
				start=map.get(currentsum-sum)+1;
				end=i;
				break;
			}
			map.put(currentsum, i);
			if(end==-1) {
				System.out.println("not found");
			}
			else {
				System.out.println(start+" "+end);
			}
		}
	}

	public static void main(String[] args) {
		SubArraySummm obj=new SubArraySummm();
		int arr[]=new int[] {10,15,-5,15,-10,5};
		obj.subArraySum(arr, 5);

	}

}
