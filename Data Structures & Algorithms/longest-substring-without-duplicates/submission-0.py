class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i = 0
        letters = set()
        max_len = 0

        for j in range(len(s)):
            while s[j] in letters:
                letters.remove(s[i])
                i += 1

            letters.add(s[j])
            max_len = max(max_len, j - i + 1)

        return max_len