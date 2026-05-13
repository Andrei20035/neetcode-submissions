class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int x = (right + left) / 2;

            if(nums[x] == target) {
                return x;
            } else if(target < nums[x]) {
                right = x - 1;
            } else if (target > nums[x]) {
                left = x + 1;
            }
        }        
        return -1;
    }
}