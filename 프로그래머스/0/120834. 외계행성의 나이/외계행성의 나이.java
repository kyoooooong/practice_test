class Solution {
    public String solution(int age) {
        String answer = "";
        String s = String.valueOf(age);

        char[] arr = s.toCharArray();

        for (char c : arr) {
            answer += (char)('a' + (c - '0'));
        }

        return answer;
    }
}