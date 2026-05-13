class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder forward = new StringBuilder();
        StringBuilder backward = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);

            if(Character.isLetter(chr) || Character.isDigit(chr)) {
                forward.append(Character.toLowerCase(chr));
            }
        }

        for(int i = s.length() - 1; i >= 0; i--) {
            char chr = s.charAt(i);

            if(Character.isLetter(chr) || Character.isDigit(chr)) {
                backward.append(Character.toLowerCase(chr));
            }
        }

        return forward.toString().equals(backward.toString());

    }
}