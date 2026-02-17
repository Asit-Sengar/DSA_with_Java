public class Second_largest_element_in_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int largest = arr[0];
        int slargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        System.out.println("The largest element is: " + largest);
        System.out.println("The second largest element is: " + slargest);
    }
}
