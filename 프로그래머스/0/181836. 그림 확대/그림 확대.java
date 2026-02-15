class Solution {
    public String[] solution(String[] picture, int k) {
        
        int h = picture.length;
        int w = picture[0].length();
        
        String[] answer = new String[k*h];
        int idx = 0;
        for(int i=0;i<picture.length;i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<picture[i].length();j++) {
                char c = picture[i].charAt(j);
                
                for(int t=0;t<k;t++) {
                    sb.append(c);
                }
            }
            
            String f = sb.toString();
            for(int t=0;t<k;t++) {
                answer[idx++] = f;
            }
        }
        
        
        return answer;
    }
}