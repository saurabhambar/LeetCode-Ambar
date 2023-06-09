class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r = nums.length-1;
        int m=-1;
        while(l <= r){
            m = l + (r - l)/2;
            // System.out.println(m);
            if(nums[m] == target){
                // System.out.print(m);
                return m;
            }
            else if(nums[m] < target)
                l=m+1;
            else
                r = m-1;
        }
        return l;
    }
}