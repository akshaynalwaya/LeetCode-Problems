class Solution {
    public int maximumSwap(int num) {
        ArrayList<Integer> digits = new ArrayList<>();
        int temp = num;
        while(temp>0){
            digits.add(temp%10);
            temp = temp/10;
        }
        Collections.reverse(digits);
        int n = digits.size();
        int i = 0;
        while(i<n){
            int max_index = getMax(digits,i);
            if(max_index!=-1 && digits.get(i)<digits.get(max_index)){
                int x = digits.get(max_index);
                int y = digits.get(i);
                digits.set(i,x);
                digits.set(max_index,y);
                break;
            }
            i++;
        }
        int result=0;
        for(int k=0;k<n;k++){
            result = result*10 + digits.get(k);
        }
        return result;
    }
    
    int getMax(ArrayList<Integer> list, int start){
        int n = list.size();
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=n-1;i>start;i--){
            if(list.get(i) > max){
                index = i;
                max = list.get(i);
            }
        }
        return index;
    }
}