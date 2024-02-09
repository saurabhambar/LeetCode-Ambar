class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hset = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
             if(hset.contains(nums[i])){
                 return true;
             }
            hset.add(nums[i]);
        }
        return false;
    }
}