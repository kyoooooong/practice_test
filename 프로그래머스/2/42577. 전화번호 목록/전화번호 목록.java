import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Arrays.sort(phone_book);   // 1️⃣ 정렬
        
        for(int i = 0; i < phone_book.length - 1; i++) {
            // 2️⃣ 현재 번호가 다음 번호의 시작인지 확인
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}
