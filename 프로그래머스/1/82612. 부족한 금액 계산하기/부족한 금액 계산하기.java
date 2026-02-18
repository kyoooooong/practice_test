import java.math.*;

class Solution {
    public long solution(int price, int money, int count) {
        long a = 0;
        
        for(int i=1;i<=count;i++) {
            a += price*i;
        }
      
        long b = (long) money - a;
        
        if (b<0) {
            return Math.abs(b);
        } else {
            return 0;
        }

    }
}