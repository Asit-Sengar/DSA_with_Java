public class Rearrage_elements_by_sign {
    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };
        int p = 0;
        int k = 0;
        int arr1[] = new int[arr.length / 2];
        int arr2[] = new int[arr.length / 2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr1[k] = arr[i];
                k = k + 1;
            } else {
                arr2[p] = arr[i];
                p = p + 1;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            arr[2 * i] = arr1[i];
            arr[(2 * i) + 1] = arr2[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}