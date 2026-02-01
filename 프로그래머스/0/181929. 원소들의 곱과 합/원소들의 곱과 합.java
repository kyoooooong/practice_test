class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int i1 = 1;
        int i2 = 0;
        for(int i : num_list) {
            i1 *=i;
        }
        
        for(int i : num_list) {
            i2 += i;
        }
        
        if (i1 > i2*i2) {
             answer =0;
        } else {
            answer = 1;
        }
        return answer;
    }
}