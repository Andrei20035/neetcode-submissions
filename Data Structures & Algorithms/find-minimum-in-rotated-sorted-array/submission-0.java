class Solution {
    public int findMin(int[] nums) {
        while(nums[0] > nums[nums.length - 1]) {
            int aux = nums[nums.length - 1];
            for(int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = aux;
        }
        return nums[0];
    }
}