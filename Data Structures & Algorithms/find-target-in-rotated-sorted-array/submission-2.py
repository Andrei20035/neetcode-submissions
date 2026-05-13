class Solution:
    def search(self, nums: List[int], target: int) -> int:
        i = 0
        j = len(nums) - 1

        while i <= j:
            m = (i + j) // 2

            if nums[m] == target:
                return m

            # jumătatea stângă e sortată
            if nums[i] <= nums[m]:
                if nums[i] <= target < nums[m]:
                    j = m - 1
                else:
                    i = m + 1

            # jumătatea dreaptă e sortată
            else:
                if nums[m] < target <= nums[j]:
                    i = m + 1
                else:
                    j = m - 1

        return -1