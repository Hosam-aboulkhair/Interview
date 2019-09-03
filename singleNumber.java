class Solution {
    public int singleNumber(int[] nums) {
      HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(set.contains(i)){
                set.remove(i);
            }else {
                set.add(i);
                
            }
        }
        for( int c: set){
            return c;
        }
        return -1;
    }
}
