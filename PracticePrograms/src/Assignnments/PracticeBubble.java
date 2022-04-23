package Assignnments;

import java.util.Arrays;

public class PracticeBubble {
    public static void main(String[] args) {
        PracticeBubble obj = new PracticeBubble();
        int[] Arr = new int[] { 9, 8, 6, 5 };
        obj.sort(Arr);
        System.out.println(Arrays.toString(Arr));

    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, min, i);
            }
        }
    }

    private void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
