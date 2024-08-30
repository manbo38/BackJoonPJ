public class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            
            if (c == '1') { 
                mode = 1 - mode;
            } else {
                if (mode == 0 && i % 2 == 0) {
                    result.append(c);
                } else if (mode == 1 && i % 2 != 0) {
                    result.append(c);
                }
            }
        }
        
        if (result.length() == 0) {
            return "EMPTY";
        }
        
        return result.toString();
    }
}