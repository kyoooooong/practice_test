class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char [] c = my_string.toCharArray();
        
        for(char k : c) {
            if (k == alp.charAt(0)){
                sb.append(Character.toUpperCase(k)) ;
            } else {
                sb.append(k);
            }
        }
        return sb.toString();
    }
}