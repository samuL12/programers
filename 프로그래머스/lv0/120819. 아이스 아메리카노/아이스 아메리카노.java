class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;
        int cups = money/price;
        int remain_money = money - cups*price;
        answer[0] = cups;
        answer[1] = remain_money;
        return answer;
    }
}