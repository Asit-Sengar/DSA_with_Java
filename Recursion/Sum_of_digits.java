
class Main {
    public int countdigits(int num) {
        int count = 0;
        if (num == 0) {
            return 0;
        }
        count = count + 1;
        return 1 + countdigits(num / 10);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int a = obj.countdigits(12);
        System.out.println(a);
    }
}
