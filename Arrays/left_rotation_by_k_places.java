//optimal
//by declaring a function

public class left_rotation_by_k_places {
    public static void swap(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left = left + 1;
            right = right - 1;
        }
    }

    public static void leftrotationbykplaces(int[] arr, int k) {
        k = k % arr.length;
        swap(arr, 0, k - 1);
        swap(arr, k, arr.length - 1);
        swap(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("after left rotation by k places the array is:");
        leftrotationbykplaces(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
