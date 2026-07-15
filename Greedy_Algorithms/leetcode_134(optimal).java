/*
    the main idea here is that we are calculating current fuel and if it becomes less than zero
    that means we cannot move ahead and we cannot consider that startindex to be our answer
    make the current gas variable zero again and move the startindex pointer
 */
class Solution {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int startindex = 0;
        int total_gas = 0;
        int total_cost = 0;
        for (int i = 0; i < gas.length; i++) {
            total_cost = total_cost + cost[i];
            total_gas = total_gas + gas[i];
        }
        if (total_cost > total_gas) {
            return -1;// if there is no valid solution
        }
        int current_gas = 0;// initialising variable
        for (int i = 0; i < gas.length; i++) {
            current_gas = current_gas + (gas[i] - cost[i]);
            if (current_gas < 0) {
                current_gas = 0;
                startindex = i + 1;
            }
        }
        return startindex;
    }

    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        int answer = canCompleteCircuit(gas, cost);
        System.out.println(answer);
    }
}