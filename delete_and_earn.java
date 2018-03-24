class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length;
        int[] earning = new int[10001];
        for(int i=0;i<n;i++)
            earning[nums[i]] += nums[i];
        int[] result = new int[10001];
        result[1] = earning[1];
        for(int i=2;i<10001;i++)
            result[i] = Math.max(earning[i]+result[i-2],result[i-1]);
        
        return result[10000];
    }
}