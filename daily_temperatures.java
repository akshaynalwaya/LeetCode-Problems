class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int days[] = new int[len];
        for(int i=0;i<len-1;i++){
            if(temperatures[i] < temperatures[i+1])
                days[i]++;
            else{
                int j = i;
                while(++j < len){
                    if(temperatures[i] >= temperatures[j])
                        days[i]++;
                    else break;
                }
                days[i]++;
                if(j==len)
                    days[i] = 0;
            }
        }
        return days;
    }
}