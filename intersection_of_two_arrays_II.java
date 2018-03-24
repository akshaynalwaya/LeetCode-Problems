class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersect = new ArrayList<>();
        int i=0,j=0;
        while(i < len1 && j < len2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j])
                j++;
            else{
                intersect.add(nums1[i]);
                i++;
                j++;
            }
        }
        int temp = intersect.size();
        int[] res = new int[temp];
        int k = 0;
        for(i=0;i<temp;i++){
            res[k++] = intersect.get(i);
        }
        return res;
    }
}