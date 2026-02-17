class Solution {
    public String solution(String[] seoul) {
        int idx = -1;
        
        for(String s : seoul) {
            idx++;
            if(s.equals("Kim")) {
                break;
            }
        }
        return "김서방은 " + idx + "에 있다";
    }
}