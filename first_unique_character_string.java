class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        if(len == 0)
            return -1;
        int[] count = new int[26];
        for(int i=0;i<len;i++)
            count[(int)s.charAt(i)-97] += 1;
        int min_index = Integer.MAX_VALUE;
        int found = 0;
        for(int i=0;i<26;i++){
            if(count[i]==1){
                found = 1;
                int temp = s.indexOf((char)(i+97));
                if(temp < min_index)
                    min_index = temp;
            }
        }
        if(found == 1)
            return min_index;
        return -1;
    }
}