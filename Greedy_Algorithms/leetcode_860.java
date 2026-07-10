class Solution {
    public static boolean lemonadeChange(int[] bills) {
        int count_5 = 0;
        int count_10 = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)
                count_5++;
            else if (bills[i] == 10) {
                if (count_5 == 0)
                    return false;
                else
                    count_5--;
                count_10++;
            } else if (bills[i] == 20) {
                if (count_5 >= 1 && count_10 >= 1) {
                    count_5 = count_5 - 1;
                    count_10 = count_10 - 1;
                } else if (count_5 >= 3) {
                    count_5 = count_5 - 3;
                } else
                    return false;
            }
        }
        return true;
    }

    // public static void main(String[] args) {
    // int arr[] = { 5, 5, 10, 10, 20 };
    // System.out.println(lemonadeChange(arr));
    // }
}
