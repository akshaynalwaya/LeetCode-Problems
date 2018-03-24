class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int n = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum += nums[i];
            min = Math.min(min,nums[i]);
        }
        return (sum - n*min);
    }
}