public class Solution {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 2, 6, 5, 1, 3, 7, 4, 9 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.println(arr[i]);
        }
    }
}
