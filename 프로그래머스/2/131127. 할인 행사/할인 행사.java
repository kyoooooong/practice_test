import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String,Integer>m = new HashMap<>();
        
        for(int i=0;i<number.length;i++) {
            m.put(want[i],number[i]);
        }
        
        for(int i=0;i<discount.length-9;i++) {
            HashMap<String,Integer>t = new HashMap<>();
            for(int j=i;j<i+10;j++) {
                t.put(discount[j],t.getOrDefault(discount[j],0)+1);
            }
            if(m.equals(t)) {
                answer++;
            }
        }
        return answer;
    }
}