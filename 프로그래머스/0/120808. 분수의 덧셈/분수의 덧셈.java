class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        int n11 = numer1*denom2;
        int d11 = denom1*denom2;
        int n22 = numer2*denom1;
        int d22 = denom2*denom1;
        
        int n = n11+n22;
        int d = d11;
        
        int g = gcd(n,d);
        
        
        
        return new int[]{n/g,d/g};
    }
    
    public int gcd(int a,int b) {
        while(b != 0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        
        return a;
    }
}