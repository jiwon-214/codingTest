class Solution {
    public int solution(int[][] sizes) {
        int maxWeight = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int weight = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);

            maxWeight = Math.max(maxWeight, weight);
            maxHeight = Math.max(maxHeight, height);
        }
        
        return maxWeight * maxHeight;
    }
}