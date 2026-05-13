class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            char[] string = str.toCharArray();
            Arrays.sort(string);
            String sortedWord = new String(string);

            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(str);
        } 
        return new ArrayList<>(map.values());
    }
}