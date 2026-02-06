class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        char[] c = my_string.toCharArray();
        
        while(s<e) {
            char temp = c[s];
            c[s] = c[e];
            c[e] = temp;
            
            s++;
            e--;
        }
        
        return new String(c);
    }
}