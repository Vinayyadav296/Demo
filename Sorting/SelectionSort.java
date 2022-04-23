import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int Arr[] = new int[] { 11, 7, 9, 4 };
        SelectionSort obj = new SelectionSort();
        obj.sort(Arr);

        System.out.println("hi");
        System.out.println(Arrays.toString(Arr));
    }

    public void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            if (min != i) {
                swap(arr, min, i);
            }

        }

    }

    public void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
