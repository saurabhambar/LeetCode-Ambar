class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int max = 0;
        int ans[] = new int[nums.length];
        int k = right;
        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                max = nums[right];
                right--;
            }
            else{
                max = nums[left];
                left++;
            }
            ans[k] = max * max;
            k--;    
        }
        return ans;
    }
}