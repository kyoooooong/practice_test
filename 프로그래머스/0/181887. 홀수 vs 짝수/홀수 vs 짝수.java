class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int t1 = 0;
        int t2 = 0;
        
        for(int i=0;i<num_list.length;i++) {
            if(i%2==1) {
                t1 += num_list[i];
            } else {
                t2 += num_list[i];
            }
        }
        
        if(t1>t2) {
            answer = t1;
        } else if(t1==t2) {
            answer = t1;
        }else {
            answer = t2;
        }
        return answer;
    }
}