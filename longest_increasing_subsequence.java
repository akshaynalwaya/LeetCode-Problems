class Solution {
    public int findLengthOfLCIS(int[] nums) {  
        int n = nums.length;
        if(n==0)
            return 0;
        int length = 1,min_length = 1;
        for(int i=1;i<n;i++){            
            if(nums[i] > nums[i-1])
                length++;
            else
                length = 1;                            
            if(length > min_length)
                min_length = length;
        }            
        return min_length;
    }
}