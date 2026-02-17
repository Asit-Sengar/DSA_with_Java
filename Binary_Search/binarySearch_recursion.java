//we are searching for target recursively using Binary Search algorithm.
class Main {
    public static int binarySearch(int arr[], int low, int high, int target) {
        if (low > high) {//base case.
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;// this returns the index, not the exact value.
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, high, target);//recursive step.
        } else {
            return binarySearch(arr, low, mid - 1, target);//recursive step.
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int a = binarySearch(arr, 0, arr.length - 1, 4);
        System.out.println(a);
    }
}
