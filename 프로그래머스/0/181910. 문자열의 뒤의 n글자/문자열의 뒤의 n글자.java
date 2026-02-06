class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int i = my_string.length();
        int n1 = i-n;
        answer = my_string.substring(n1);
        return answer;
    }
}