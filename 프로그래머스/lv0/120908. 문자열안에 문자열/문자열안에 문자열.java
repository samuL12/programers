class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        int str2_idx = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)==str2.charAt(str2_idx)){
                str2_idx++;
                if(str2_idx == str2.length())
                    return answer = 1;
            }
            else{
                str2_idx = 0;
            }
        }
        return answer = 2;
    }
}