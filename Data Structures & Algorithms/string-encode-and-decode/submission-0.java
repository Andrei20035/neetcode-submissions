class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < strs.size(); i++) {
            result.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int len = 0;

            while(i < str.length() && Character.isDigit(str.charAt(i))) {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;

            String substring = str.substring(i, i + len);
            result.add(substring);

            i += len;
        }

        System.out.print(result);
        return result;
    }
}
