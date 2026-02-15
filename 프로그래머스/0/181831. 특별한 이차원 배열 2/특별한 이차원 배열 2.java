class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;   // 하나라도 다르면 바로 실패
                }
            }
        }
        return 1; // 끝까지 다 같으면 성공
    }
}
