class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String i1="";
        String i2="";
        for ( int i:num_list) {
            if (i %2 == 1) {
                i1 += i + "";
            }else {
                i2 +=i + "";
            }
        }
        
        answer += (Integer.parseInt(i1)+Integer.parseInt(i2));
        return answer;
    }
}