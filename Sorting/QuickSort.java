import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        int Arr[] = new int[] { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
        obj.sort(Arr, 0, 8) ; 
        System.out.println(Arrays.toString(Arr));
    }

    public void partition(int arr[], int lb, int ub) {
        int pivot = arr[lb];
        start = lb;
        end = ub;
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr,arr[ lb],arr[en
                return end;
            }
        }
    }

    private void swap(int arr[],arr[index1],int arr[index2]){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public void sort(int arr[]  ,int l  , int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            sort(arr, lb, loc - 1);
            sort(arr, loc + 1, ub);
        }

    }

}
