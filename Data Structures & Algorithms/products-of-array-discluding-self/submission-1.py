class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = []
        left = [1]
        left_product = 1

        for i in range(1, len(nums)):
            left_product *= nums[i - 1]
            left.append(left_product)
        
        right = [1] * len(nums)
        right_product = 1

        for i in range(len(nums) - 2, -1, -1):
            right_product *= nums[i + 1]
            right[i] = right_product
        
        
        for i in range(len(nums)):
            result.append(left[i] * right[i])
        
        return result
        

        
        