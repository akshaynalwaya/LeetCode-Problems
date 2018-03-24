class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            int temp = i;
            int found = 1;
            while(temp>0){
                int x = temp%10;
                if(x==0 || i%x != 0){
                    found = 0;
                    break;
                }  
                temp = temp/10;
            }
            if(found==1)
                res.add(i);
        }        
        return res;
    }
}