import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] l = {a,b,c,d};
        
        Arrays.sort(l);
        
        if(l[0] == l[3]) {
            return 1111*l[0];
        }
        
        if (l[0]==l[2] && l[0] != l[3]) {
            int t = 10 * l[0] + l[3];
            return t * t;
        }
        
        if (l[1]==l[3] && l[0] != l[1]) {
            int t = 10 * l[3] + l[0]; // p = l[3], q = l[0]
            return t * t;
        }
        
        if (l[0]==l[1] && l[2] == l[3] && l[1] != l[2]) {
            int p = l[0], q = l[2];
            return (p + q) * Math.abs(p - q);
        }
        
        if (l[0] ==l[1]) return l[2] * l[3];
        if (l[1] ==l[2]) return l[0] * l[3];
        if (l[2] ==l[3]) return l[0] * l[1];
        
        return l[0];
    }
}