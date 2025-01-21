class Solution {
    public int[] solution(String s) {
        int zeroCount = 0;
        int binaryCount = 0;

        while(!s.equals("1")) {
            int originalLength = s.length();
            s = s.replaceAll("0", "");

            zeroCount += originalLength - s.length();
            s = Integer.toBinaryString(s.length());
            binaryCount++;
        }

        return new int[]{binaryCount, zeroCount};
    }
}