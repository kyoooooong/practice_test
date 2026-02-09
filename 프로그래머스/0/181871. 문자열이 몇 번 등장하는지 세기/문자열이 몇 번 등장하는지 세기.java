class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int len = pat.length();

        for (int i = 0; i < myString.length() - len+1; i++) {
            if (myString.substring(i, i + len).equals(pat)) {
                count++;
            }
        }
        return count;
    }
}
