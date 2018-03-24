class Solution {
    public boolean checkPossibility(int[] nums) {
        int error = 0;
        int len = nums.length;
        
        for(int i=1;i < len && error < 2;i++){
            if(nums[i-1] > nums[i]){
                error++;
                if(i<2)
                    nums[i-1] = nums[i];
                else if(nums[i-2] <= nums[i])
                    nums[i-1] = nums[i];
                else
                    nums[i] = nums[i-1];
            }
        }
        if(error < 2)
            return true;
        return false;        
    }
}