// Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
class Solution {
    public static boolean helper(int[] gas, int[] cost, int index) {
        int startindex = index;
        int currentindex = index;
        int total_fuel = gas[index];
        for (int i = 0; i < gas.length; i++) {
            if (total_fuel < cost[currentindex]) {
                return false;// if i cannot move return false;
            }
            if (total_fuel >= cost[currentindex]) {
                total_fuel = total_fuel - cost[currentindex];// expending total fuel
                currentindex = (currentindex + 1) % gas.length;// calculating current index;
                if (currentindex == startindex) {
                    return true;// that means we completed the rotation;
                }
                total_fuel = total_fuel + gas[currentindex];// updating total fuel
            }
        }
        return false;// if we cannot reach then return false;
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if ((gas[i] >= cost[i]) && (helper(gas, cost, i))) {
                return i;
            }
        }
        return -1;
    }
}