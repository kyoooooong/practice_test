import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = emergency.clone();
        int[] arr = new int[emergency.length];
        
        Arrays.sort(emergency);

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] == answer[j]) {
                    arr[j] = emergency.length - i;
                }
            }
        }

        return arr;
    }
}