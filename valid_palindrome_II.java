class Solution {
    public boolean validPalindrome(String s) {
        int start = -1;
        int end = s.length();
        while(++start < --end){
            if(s.charAt(start)!=s.charAt(end))
                return (check_Palindrome(s,start,end+1))||(check_Palindrome(s,start-1,end));
        }
        return true;
    }

    public boolean check_Palindrome(String s, int start, int end){
        while(++start < --end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
        }
        return true;
    }
}
