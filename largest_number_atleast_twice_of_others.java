class Solution {
    public int dominantIndex(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int len = temp.length;
        if(len == 1)
            return 0;        
        int max_val = temp[len-1];
            
        if(temp[len-2]!=0 && (max_val/temp[len-2]) < 2)
            return -1;
        for(int i=0;i<len;i++)
            if(nums[i] == max_val)
                return i;
        return -1;
    }
}