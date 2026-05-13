import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        heap = []
        result = []

        for num in nums:
            if num not in freq:
                freq[num] = 1
            else:
                freq[num] += 1

        for item in freq.items():
            heapq.heappush(heap, (item[1], item[0]))
            if len(heap) > k:
                heapq.heappop(heap)
        
        for item in heap:
            result.append(item[1])

        return result