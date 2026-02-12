class Solution {
    public int[] solution(String myString) {
        
        String[] s = myString.split("x",-1);
        int[] a = new int[s.length];
        int idx= 0;
        for(String ss:s) {
            int i = ss.length();
            a[idx] = i;
            idx++;
        }
        return a;
    }
}