import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        StringBuilder sb = new StringBuilder();

        ArrayList<String> l = new ArrayList<>();
        
        for (int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);
            if (ch == 'a'|| ch == 'b' || ch =='c') {
                if (sb.length() > 0) {      // ← 이 조건 추가
        l.add(sb.toString());
    }
                sb.setLength(0);
            } else {
                sb.append(ch);
            }
        }
        
        if(sb.length() >0) {
            l.add(sb.toString());
        }
        
        if(l.size() ==0) {
            return new String[]{"EMPTY"};
        }
        
        
        return l.toArray(new String[0]);
    }
}