class Solution {
    public int distributeCandies(int[] candies) {
        int num = candies.length;
        Set<Integer> set = new HashSet<Integer>();
        int temp = num/2;
        for(int i=0;i<num;i++){
            set.add(candies[i]);
            if(set.size() > temp)
                return temp;
        }
        return set.size();
    }
}