class Solution {
    public int solution(int n) {
        String base3 = Integer.toString(n, 3);
        StringBuffer reverseBase3 = new StringBuffer(base3).reverse();
        Integer answer = Integer.parseInt(reverseBase3.toString(), 3);
        return answer;
    }
}