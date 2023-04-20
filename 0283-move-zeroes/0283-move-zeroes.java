class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i =0 ,j = 0;
        int count = 0;
        while(i <n){
            if(nums[i] == 0){
                count++;
                i++;
                continue;
            }
            nums[i-count]  = nums[i];
            i++;
        }
        j = i-count;
        while(count>0){
            --count;
            nums[j++] = 0;
        }
    }
}