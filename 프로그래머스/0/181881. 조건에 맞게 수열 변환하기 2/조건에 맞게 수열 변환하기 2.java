import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            int[] next = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    next[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    next[i] = arr[i] * 2 + 1;
                } else {
                    next[i] = arr[i];
                }
            }

            if (Arrays.equals(arr, next)) {
                break;
            }

            arr = next;
            answer++;
        }

        return answer;
    }
}
