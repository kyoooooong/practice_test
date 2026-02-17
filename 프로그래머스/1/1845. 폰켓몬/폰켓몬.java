import java.math.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int x : nums) h.add(x);
        
        int size = h.size();
        int m = nums.length/2;
        
        return Math.min(size,m);
    }
}