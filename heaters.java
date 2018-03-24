class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int n = houses.length;
        int h = heaters.length;
        int min_radius = 0;
        int i=0,j=0;
        while(i<n){
            while(j<h-1 && (heaters[j] + heaters[j+1]) <= houses[i]*2)
                j++;
            min_radius = Math.max(min_radius,Math.abs(houses[i] - heaters[j]));
            i++;
        }
        return min_radius;
    }
}