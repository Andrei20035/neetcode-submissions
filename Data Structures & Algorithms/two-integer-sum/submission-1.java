class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dif = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            dif.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            var complementPosition = dif.get(complement);

            if (complementPosition != null && complementPosition != i) {
                return new int[] {i, complementPosition};
            }
        }
        return new int[0];
    }
}
