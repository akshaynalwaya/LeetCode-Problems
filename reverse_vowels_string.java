class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        if(len<2)
            return s;
        String vowels = "aeiouAEIOU";
        char[] str = s.toCharArray();
        int start = 0;
        int end = len-1;
        while(start<end){
            while(start<end && !vowels.contains(str[start]+""))
                start++;
            while(start<end && !vowels.contains(str[end]+""))
                end--;
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return new String(str);
    }
}