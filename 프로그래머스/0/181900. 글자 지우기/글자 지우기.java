class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        boolean[] b = new boolean[my_string.length()];
        
        for(int i:indices) {
            b[i] = true;
        }
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<my_string.length();i++) {
            if(b[i] != true) {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}