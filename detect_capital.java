class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if(len<2)
            return true;
        int lastCapital = 0;
        if((int)word.charAt(len-1) <= 90)
            lastCapital = 1;
        if(lastCapital==1){
            for(int i=len-2;i>=0;i--){
                if((int)word.charAt(i) > 90)
                    return false;
            }
            return true;
        }
        else{
            for(int i=1;i<len-1;i++){
                if((int)word.charAt(i) < 97)
                    return false;
            }
            return true;
        }
    }
}

