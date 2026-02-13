class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length != arr2.length) {
            if(arr1.length > arr2.length) {
                answer = 1;
            } else if (arr1.length < arr2.length) {
                answer = -1;
            }
        } else {
            int t1= 0;
            int t2=0;
            for(int i:arr1) {
                t1 += i;
            }
            for(int j:arr2) {
                t2+= j;
            }
            
            if(t1>t2) {
                answer=1;
            } else if(t1<t2) {
                answer=-1;
            }
        }
        return answer;
    }
}