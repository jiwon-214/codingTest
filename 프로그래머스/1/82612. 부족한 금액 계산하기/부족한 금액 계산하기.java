class Solution {
    public long solution(int price, int money, int count) {
        long totalMoney = 0;
        long needMoney = 0;
        for (int i = 1; i <= count; i++) {
            long countMoney = price * i;
            totalMoney += countMoney;
        }

        if (totalMoney > money) {
            needMoney = totalMoney - money;
        }
        
        return needMoney;
    }
}