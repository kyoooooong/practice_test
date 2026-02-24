class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx = 0;
        int idx2 = 0;
        for(String s : goal) {
            if (idx < cards1.length && cards1[idx].equals(s))  {
                idx++;
            } else if (idx2<cards2.length &&cards2[idx2].equals(s))  {
                idx2++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}