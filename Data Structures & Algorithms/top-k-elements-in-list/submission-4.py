import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        result = []
        for num in nums:
            if num not in freq:
                freq[num] = 1
            else:
                freq[num] += 1
        
        buckets = [[] for _ in range(len(nums) + 1)]

        for item in freq.items():
            buckets[item[1]].append(item[0])
        
        for i in range(len(buckets) - 1, 0, -1):
            if len(buckets[i]) != 0:
                for elem in buckets[i]:
                    result.append(elem)
                    if len(result) == k:
                        return result


        return []