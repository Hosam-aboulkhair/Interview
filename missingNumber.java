class Solution {
    public int missingNumber(int[] nums) {
        int res =0;
        int n = nums.length + 1;
             
        for(int i : nums){
            res += i;
        }
   
        
        return (n * (n -1) / 2) - res;
    }
}
