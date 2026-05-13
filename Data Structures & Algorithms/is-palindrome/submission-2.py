class Solution:
    def isPalindrome(self, s: str) -> bool:
        new_string = ""
        for c in s:
            if c.isalnum():
                new_string = new_string + c.lower()
        
        i = 0
        j = len(new_string) - 1

        while i < j:
            if new_string[i] != new_string[j]:
                return False
            i += 1
            j -= 1
        return True
            

        