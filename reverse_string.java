class Solution {
    public String reverseString(String s) {
        int i=0;
        char[] result = s.toCharArray();
        int len = s.length();
        if(len<2)
            return s;
        int mid = len/2;
        while(i<=mid){
            result[i] = s.charAt(len-i-1);
            result[len-i-1] = s.charAt(i);
            i++;
        }        
        return new String(result);
    }
}