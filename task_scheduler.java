class Solution {
    public int leastInterval(char[] tasks, int n) {
        int map[] = new int[26];
        int max_index = 0;
        int len = tasks.length;
        int temp,i;
        for(i =0;i<len;i++){
            temp = (int)tasks[i] - 65;
            map[temp]++;
        }
        Arrays.sort(map);               
        i=25;
        while(i>=0 && map[i] == map[25]){
            i--;
        }
        temp = (map[25] - 1)*(n+1) + (25-i);
        int res = Math.max(temp,len);
        return res;
    }
}