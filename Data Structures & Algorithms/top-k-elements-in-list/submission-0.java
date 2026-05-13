class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] result = new int[k];

        for(int i = 0; i < nums.length; i++) {
            freq.putIfAbsent(nums[i], 0);
            freq.put(nums[i], freq.get(nums[i]) + 1);
        } 

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freq.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (int j = 0; j < k; j++) {
            result[j] = entryList.get(j).getKey();
        }

        return result;
    }
}