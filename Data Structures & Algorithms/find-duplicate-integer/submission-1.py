class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        hash = {}
        for i in range(len(nums)):
            hash[nums[i]] = hash.get(nums[i], 0)+1
            if hash[nums[i]] > 1:
                return nums[i]
        return 0

