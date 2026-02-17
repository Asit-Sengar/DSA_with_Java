
public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 20, 13, 24, 52, 46 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("sir the sorted array is :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Happy programming, Sir//
    }
}
