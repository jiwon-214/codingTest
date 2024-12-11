class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = 0;
        int lcm = 0;

        gcd = getGcd(n, m);
        answer[0] = gcd;
        answer[1] = (n * m) / gcd;
        return answer;
    }

    public int getGcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}