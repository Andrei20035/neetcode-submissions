class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (char c : s.toCharArray()) {
            countS.put(c, countS.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        System.out.println("String S: ");
        for(var entry : countS.entrySet()) {
            System.out.printf("(%c : %d)%n", entry.getKey(), entry.getValue());
        }

        System.out.println("String T: ");
        for(var entry : countT.entrySet()) {
            System.out.printf("(%c : %d)%n", entry.getKey(), entry.getValue());
        }

        for(var key : countS.keySet()) {
            if (!countS.get(key).equals(countT.get(key))) {
                return false;
            }
        }

        return true;


        
        
    }
}
