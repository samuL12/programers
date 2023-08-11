class Solution {
    public int[] solution(int n) {
        int temp = (n%2 == 0) ? n/2 : n/2+1;
        int[] answer = new int[temp];
        int idx = 0;
        for(int i=1; i<n+1; i++){
            if(i%2==1){
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }
}