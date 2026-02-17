
public class Prefix_sum {
    public static void prefixsum(int arr[], int prefix[], int i) {
        if (i == 0) {
            prefix[0] = arr[i];
            return;
        }
        prefixsum(arr, prefix, i - 1);

        prefix[i] = arr[i] + prefix[i - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int prefix[] = new int[arr.length];
        prefixsum(arr, prefix, arr.length - 1);
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i]);
        }
        // Happy DSA, Sir//
    }
}