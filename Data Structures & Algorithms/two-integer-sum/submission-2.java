class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dif = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(dif.containsKey(complement)) {
                return new int[]{dif.get(complement), i};
            } 

            dif.put(nums[i], i);
        }

        return new int[0];
    }
}
