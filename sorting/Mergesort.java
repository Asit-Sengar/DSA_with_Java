public class Mergesort { // Fixed: Class name starts with uppercase
    public static void merge(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[high - low + 1];
        int k = 0; // Index for temp array

        // Merge the two halves into temp[]
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++]; // Simplified: k++ and left++
            } else {
                temp[k++] = arr[right++]; // Simplified: k++ and right++
            }
        }

        // Copy remaining left elements
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining right elements
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy merged elements back to original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 1, 3, 5 };
        merge(arr, 0, 2, 5);

        System.out.println("The sorted array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // print() instead of println()
        }
    }
}