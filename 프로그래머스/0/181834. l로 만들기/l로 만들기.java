class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] cc = myString.toCharArray();
        int idx = 0;
        for(char c:cc) {
            if(c<'l') {
                cc[idx] = 'l';
            }
            idx ++;
        }
        return new String(cc);
    }
}