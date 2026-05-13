class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            char first = s.charAt(i);
            char second = s.charAt(j);

            if(Character.isLetter(first) || Character.isDigit(first)) {
                if(Character.isLetter(second) || Character.isDigit(second)) {
                    if(Character.toLowerCase(first) == Character.toLowerCase(second)) {
                        i++;
                        j--;
                    } else {
                        return false;
                    }
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return true;
    }
}