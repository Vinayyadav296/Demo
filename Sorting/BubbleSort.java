import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int Arr[] = new int[] { 8, 1, 2 };
        BubbleSort obj = new BubbleSort();
        obj.sort(Arr);
        System.out.println(Arrays.toString(Arr));

    }

    public void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
