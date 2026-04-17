//the main idea here is that first we will create a binary string of 32 bits and then iterate in it
//then we will create an interger by taking characters from the string and doing there xor and left shift
//because left shift is equals to multiplying it by k places
class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int length = 32 - s.length();
        int count = 0;
        while (count < length) {
            sb.insert(count, '0');
            count++;
        }
        int answer = 0;
        int i = 31;
        while (i >= 0) {
            int temp = sb.charAt(i) - '0';

            answer = answer ^ temp << i;
            i--;
        }
        return answer;
    }
}
