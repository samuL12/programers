class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int len_idx = num2-num1+1;
        int[] answer = new int[len_idx];
        int idx = 0;
        for(int i=num1; i<num2+1; i++){
            answer[idx] = numbers[i];
            idx += 1;
        }
        return answer;
    }
}