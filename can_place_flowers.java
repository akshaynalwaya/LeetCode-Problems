class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plots = flowerbed.length-1;
        int temp = n;
        if(plots == 0 && n == 1 && flowerbed[0] == 0){
            return true;
        }
        if(plots>0 && temp>0){
            if((flowerbed[0]+flowerbed[1])==0){
                flowerbed[0] = 1;
                temp--;
            }
            if(temp==0)
                return true;
            if((flowerbed[plots-1] + flowerbed[plots]) == 0){
                flowerbed[plots] = 1;
                temp--;
            }            
            if(temp==0)
                return true;
        }
        for(int i=1;i<plots && temp>0;i++){
            if((flowerbed[i-1]+flowerbed[i]+flowerbed[i+1])==0){
                flowerbed[i] = 1;
                temp--;                    
            }                
        }
        if(temp>0)
            return false;
        return true;
    }
}