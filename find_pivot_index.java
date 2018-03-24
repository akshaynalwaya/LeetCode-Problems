class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        if(len==0)
            return -1;
        if(len==1)
            return 0;
        int i = len-1;
        int pivot = 0;
        int sum1=0,sum2=0;
        while(i>0)
            sum2 += nums[i--];
        i = len-1;
        while(pivot < i){
            if(sum1==sum2)
                return pivot;
            else{                
                sum1 += nums[pivot++];                
                sum2 -= nums[pivot];
            }            
        }
        if(pivot==(len-1)){            
            sum2 = 0;
            if(sum1 == sum2)
                return pivot;
        }
        return -1;
    }
}