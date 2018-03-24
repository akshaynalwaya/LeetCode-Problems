class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> intersect = new HashSet<>();
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
        int[] res = new int[intersect.size()];
        int k = 0;
        for(Integer num : intersect){
            res[k++] = num;
        }
        return res;
    }
}