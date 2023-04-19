class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int ans = nums[i] * nums[i];
            res[i] = ans;
        }
        Arrays.sort(res);
        return res;
    }
}