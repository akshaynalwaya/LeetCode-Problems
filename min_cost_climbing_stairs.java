class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int min_cost1 = cost[0];
        int min_cost2 = cost[1];
        int temp;
        for(int i=2;i<n;i++){
            temp = cost[i] + Math.min(min_cost1,min_cost2);
            min_cost1 = min_cost2;
            min_cost2 = temp;
        }
        
        return Math.min(min_cost1,min_cost2);
    }
}