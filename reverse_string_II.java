class Solution {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int len = s.length();
        int jump = 2*k;
        for(int i=0;i<len;i += jump){
            int start = i;
            int end = Math.min(i+k-1,len-1);
            while(start<end){
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }
        return new String(str);
    }
}