class Main {
    public static int Binary_Search(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int answer = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                answer = target;
                return answer;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int a = Binary_Search(arr, 11);
        System.out.println(a);
    }
}
