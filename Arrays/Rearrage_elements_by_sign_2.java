public class Rearrage_elements_by_sign_2 {
    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };
        int ps = 0;
        int ng = 1;
        int answer[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                answer[ps] = arr[i];
                ps = ps + 2;
            } else {
                answer[ng] = arr[i];
                ng = ng + 2;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
    }
}
