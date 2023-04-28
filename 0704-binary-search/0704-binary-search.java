class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int result = binarySearch(nums, 0, n-1,target);
        return result;
    }

    public static int binarySearch(int[] nums, int l, int r, int x){
        if(r >= l){
            int mid = l + (r-l) / 2;

            if(nums[mid] == x)
                return mid;
            else if(nums[mid] > x)
                return binarySearch(nums,l,mid-1,x);
            return binarySearch(nums,mid+1,r,x);                
        }
        return -1;
    }
}