class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(int i = 0; i < s.length(); i++) {
            char paranthesis = s.charAt(i);

            if("([{".indexOf(paranthesis) != -1) {
                stack.push(paranthesis);
            } else if(!stack.isEmpty() && map.get(stack.peek()) == paranthesis) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}