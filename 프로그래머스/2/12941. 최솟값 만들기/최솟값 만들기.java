import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int num1;
        int num2;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0, j = B.length - 1; i < A.length && j >= 0; i++, j--) {
            num1 = A[i];
            num2 = B[j];
            answer += num1 * num2;
        }

        return answer;
    }
}