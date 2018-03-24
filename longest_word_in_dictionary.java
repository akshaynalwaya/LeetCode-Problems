
class Solution {
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d,(s1,s2) -> s1.length()!=s2.length() ? Integer.compare(s1.length(), s2.length())*(-1) : s1.compareTo(s2));
        HashMap<Character,ArrayList<Integer>> map = new HashMap<>();
        int m = s.length();
        for(int i=0;i<m;i++){
            if(map.containsKey(s.charAt(i))){
                ArrayList<Integer> temp_list = map.get(s.charAt(i));
                temp_list.add(i);
                map.put(s.charAt(i),temp_list);
            }
            else{
                ArrayList<Integer> temp_list = new ArrayList<>();
                temp_list.add(i);
                map.put(s.charAt(i),temp_list);
            }
        }
        int currIndex = -1;
        int n = d.size();
        for(int i=0;i<n;i++){
            String str = d.get(i);
            int len = str.length();
            int j = 0;
            currIndex = -1;
            while(j<len){
                if(map.containsKey(str.charAt(j))){
                    int[] tmp = map.get(str.charAt(j)).stream().mapToInt(in -> in).toArray();
                    int k = 0;
                    int x = tmp.length;
                    
                    currIndex = binarySearch(tmp,0,x-1,currIndex);
                    if(currIndex == -1)
                        break;
                    //System.out.println(currIndex+" "+j);
                    /*
                    while(k<x && tmp.get(k) <= currIndex)
                        k++;
                    
                    if(k==x)
                        break;
                    else{
                        System.out.println(currIndex+" "+j);
                        currIndex = tmp.get(k);
                    }
                    */
                    
                }
                else
                    break;

                j++;
            }            
            if(j==len)
                return str;
        }        
        return "";
    }

    int binarySearch(int[] array, int start, int end, int target){
        if(start <= end){
            int mid = (start+end)/2;
            if(mid == 0 && array[mid] > target)
                return array[mid];
            if(array[mid] > target && array[mid-1] <= target)
                return array[mid];
            else if(array[mid] > target)
                return binarySearch(array,start,mid-1,target);
            else
                return binarySearch(array,mid+1,end,target);
        }
        return -1;
    }
    
}

