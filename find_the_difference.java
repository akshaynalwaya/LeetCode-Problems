class Solution {
    public char findTheDifference(String s, String t) {
        int sum_s=0;
        int sum_t=0;
        int len_s = s.length();
        int i = 0;
        for(i=0;i<len_s;i++){
            sum_s += (int)s.charAt(i);
            sum_t += (int)t.charAt(i);
        }
        sum_t += (int)t.charAt(i);
        return (char)(sum_t - sum_s);
    }
}