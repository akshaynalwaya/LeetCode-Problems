class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
            int i=0;
            while(i<(len-1)){
                if(bits[i]==1){
                    if((i+1)==(len-1))
                        return false;
                    i += 2;
                }
                else           
                    i++;
            }
            return true;
        
    }
}