import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int Arr[] = new int[] { 8, 1, 2, 9, 7 };
        InsertionSort obj = new InsertionSort();
        obj.sort(Arr);
        System.out.println(Arrays.toString(Arr));
    }

    public void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

    }

}
