class Solution {
    public int solution(String binomial) {
        String[] a = binomial.split(" "); // ["43", "+", "12"]

        int left = Integer.parseInt(a[0]);
        int right = Integer.parseInt(a[2]);
        String op = a[1];

        if (op.equals("+")) return left + right;
        if (op.equals("-")) return left - right;
        return left * right; // op가 "*"인 경우
    }
}
