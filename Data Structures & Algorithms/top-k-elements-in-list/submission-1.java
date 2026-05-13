class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int[] result = new int[k];
        int maxFreq = 0;

        for(int num: nums) {
            freq.putIfAbsent(num, 0);
            freq.put(num, freq.get(num) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for(var entry: freq.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }


        int index = 0;
        for( int i = buckets.length - 1; i > 0 && index < k; i--) {
            for(int n: buckets[i]) {
                result[index++] = n;

                if(index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
