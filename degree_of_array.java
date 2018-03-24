class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] freq = new int[50000];
        int max_count = 0;
        int value = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            freq[nums[i]] += 1;
            if(freq[nums[i]] > max_count){
                max_count = freq[nums[i]];
                value = nums[i];
            }
        }
        List<Integer> contender = new ArrayList<>();
        for(int i=0;i<50000;i++){
            if(freq[i]==max_count)
                contender.add(i);
        }
        
        int contend = contender.size();

        int result = 50000;
        for(int j=0;j<contend;j++){
        value = contender.get(j);                
                int left=0,right=0;        
                for(int i=0;i<n;i++){
                    if(nums[i] == value){
                        left = i;
                        break;
                    }                            
                }
                for(int i = n-1;i>=0;i--){
                    if(nums[i] == value){
                        right = i;
                        break;
                    }                            
                }
                result = Math.min(result,(right-left+1));                                
            }
            return result;
    }
}
