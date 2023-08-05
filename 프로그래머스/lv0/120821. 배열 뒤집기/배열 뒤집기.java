class Solution {
    public int[] solution(int[] num_list) {
        int len_num = num_list.length;
        int[] answer = new int[len_num];
        int idx = 0;
        for(int i=1; i<len_num+1; i++){
            answer[idx] = num_list[len_num-i];
            idx++;
        }
        return answer;
    }
}