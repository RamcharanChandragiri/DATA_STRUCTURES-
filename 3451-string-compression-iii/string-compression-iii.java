class Solution {
    public String compressedString(String word) {
        int i = 0;
        int j = 0;
        int count = 0;
        String s = "";
        
        while (j < word.length()) {
            if (i < word.length() && word.charAt(i) == word.charAt(j) && count < 9) {
                count++;
                j++;
            } else {
                s = s + count + word.charAt(i);
                i = j;
                count = 0;
            }
        }
        
        if (count > 0) {
            s = s + count + word.charAt(i);
        }
        
        return s;
    }
}
