class Solution {
    public int countBinarySubstrings(String s) {
        int result = 0;
        int n = s.length();
        int prev = 0,curr = 1;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1))
                curr++;
            else{
                result += Math.min(prev,curr);
                prev = curr;
                curr = 1;
            }            
        }
        return result + Math.min(prev,curr);
    }
}