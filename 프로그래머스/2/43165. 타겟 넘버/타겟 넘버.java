class Solution {
    int answer = 0;
    
    public void dfs(int[] arr, int t, int idx, int sum) {
        if(idx == arr.length) {
            if(sum == t) answer+=1;
            
            return;
        }
        
        dfs(arr,t,idx+1,sum+arr[idx]);
        dfs(arr,t,idx+1,sum-arr[idx]);
    }
    
    public int solution(int[] arr, int target) {
        dfs(arr,target,0,0);
        
        return answer;
    }
}