import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        Arrays.sort(wallet);
        int wMin = wallet[0], wMax = wallet[1];

        int answer = 0;
        int a = bill[0], b = bill[1];

        while (true) {
            int bMin = Math.min(a, b);
            int bMax = Math.max(a, b);

            // 들어가면 종료 (그대로 or 90도 회전 가능이 이 조건에 포함됨)
            if (bMin <= wMin && bMax <= wMax) break;

            // 긴 쪽을 반으로 접기
            if (a >= b) a /= 2;
            else b /= 2;

            answer++;
        }

        return answer;
    }
}