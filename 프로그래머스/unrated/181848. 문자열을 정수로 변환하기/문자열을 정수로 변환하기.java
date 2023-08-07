class Solution {
    public int solution(String n_str) {
        int answer = 0;
        int temp = 1;
        for(int i=1; i<n_str.length()+1; i++){
            answer += temp * ((int)n_str.charAt(n_str.length()-i)-48);
            temp *= 10;
        }
        return answer;
    }
}