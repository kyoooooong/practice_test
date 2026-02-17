class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0; // 지갑 가로(긴 변들 중 최대)
        int maxH = 0; // 지갑 세로(짧은 변들 중 최대)

        for (int[] s : sizes) {
            int w = s[0];
            int h = s[1];

            int big = Math.max(w, h);
            int small = Math.min(w, h);

            maxW = Math.max(maxW, big);
            maxH = Math.max(maxH, small);
        }

        return maxW * maxH;
    }
}
