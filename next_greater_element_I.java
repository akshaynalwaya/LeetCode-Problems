class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int temp;
        int res[] = new int[len];
        for(int i=0;i<len;i++){
            temp = nums1[i];
            res[i] = getNextHigh(temp,nums2);
        }
        return res;
    }
    
    private int getNextHigh(int x,int[] nums2){
        int count=-1;
        int len = nums2.length;
        int index=-1;
        for(int i=0;i<len;i++){
            if(nums2[i] == x){
                index = i;
                break;
            }                
        }
        
        if(index > (len-1) || index<0){
            return -1;
        }
        for(int i=index;i<(len-1);i++){
            if(nums2[index] < nums2[i+1]){
                count = i+1;
                break;
            }
        }
        if(count == -1)
            return -1;
        return nums2[count];
    }
}