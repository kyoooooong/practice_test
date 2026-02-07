class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int start=-1;
        int end = -1;
        int ii=0;
        for(int i:arr) {
            if(i==2) {
                if(start==-1) {
                    start = ii;
                }
                end = ii;
            }
            ii++;
        }
        if(start==-1) return new int[]{-1};
        int[] a = new int[end-start+1];
        int idx = 0;
        for(int i=start;i<end+1;i++) {
            a[idx++]= arr[i];
        }
        return a;
    }
}