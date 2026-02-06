class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        
        if (arr.length-1 >=idx ) {
            for ( int i=idx;i<arr.length;i++) {
                if(arr[i] == 1) {
                    answer=i;
                    break;
                }
            }
        } else {
            answer = -1;
        }
            
        return answer;
    }
}