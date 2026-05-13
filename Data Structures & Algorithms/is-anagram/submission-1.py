class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        hashmap = {}

        for c in s:
            if c in hashmap:
                hashmap[c] += 1
            else:
                hashmap[c] = 1
        
        for c in t:
            if c not in hashmap:
                return False
            hashmap[c] -= 1
        
        for value in hashmap.values():
            if value != 0:
                return False
        
        return True
        


        
        