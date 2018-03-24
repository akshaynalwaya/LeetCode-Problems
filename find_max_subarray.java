class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double avg = Integer.MIN_VALUE;
        double sum = Integer.MIN_VALUE;
        if(n==k){
            sum = IntStream.of(nums).sum();
            avg = sum/n;
        }
        else{
            int temp;
            for(int i=0;i<=(n-k);i++){
                temp = 0;
                for(int j=0;j<k;j++){
                    temp += nums[i+j];
                }                
                if(sum < temp){
                    sum = temp;
                }
            }
            avg = sum/k;
        }
            
        return avg;
    }
}