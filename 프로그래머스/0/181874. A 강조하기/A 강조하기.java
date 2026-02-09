class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        for(char c : myString.toCharArray()) {
            
            if(c=='a' || c=='A') {
                sb.append('A');
            } else if(Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}