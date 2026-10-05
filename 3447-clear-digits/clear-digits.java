class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                }
            } else {
                stack.push(c);
            }
        }
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return new String(result);
    }
}