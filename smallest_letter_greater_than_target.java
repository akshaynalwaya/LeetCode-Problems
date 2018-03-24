class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        char ans = letters[0];
        for(int i=0;i<n;i++){
            if((int)target < (int)letters[i])
                return letters[i];            
        }
        return ans;
    }
}