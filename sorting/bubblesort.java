public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 20, 13, 24, 52, 46 };
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("the sorted array is:");
        for (int num : arr) {
            System.out.println(num + "");
        }

        // Happy DSA Sir//
    }
}
