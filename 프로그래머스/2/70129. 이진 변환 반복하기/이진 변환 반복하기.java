class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        int z = 0;
        int cnt = 0;
        while(!s.equals("1")) {
            int n=0;
            for(char c:s.toCharArray()) {
                if(c=='0') {
                    z ++;
                } else {
                    n++;
                }
            }
            
            s = Integer.toBinaryString(n);
            cnt++;
        }
        
        return new int[]{cnt,z};
    }
}