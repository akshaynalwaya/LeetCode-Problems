class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max_one = 0;
        int temp = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1)
                temp++;
            else{
                max_one = Math.max(max_one,temp);
                temp = 0;
            }
        }
        return Math.max(max_one,temp);
    }
}