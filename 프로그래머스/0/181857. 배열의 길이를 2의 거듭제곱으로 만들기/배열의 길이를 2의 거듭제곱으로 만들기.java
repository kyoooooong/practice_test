import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int l = arr.length;
        int s = 1;

        while (s < l) {
            s *= 2;
        }

        int[] a = new int[s];
        for (int i = 0; i < l; i++) {
            a[i] = arr[i];
        }
        return a;
    }
}
