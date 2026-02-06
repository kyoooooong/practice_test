class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] c = my_string.toCharArray();
        
        for ( int i=0;i<queries.length;i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            while(s<e) {
                char temp = c[s];
                c[s] = c[e];
                c[e] = temp;
                
                s++;
                e--;
            }
        }
        return new String(c);
    }
}