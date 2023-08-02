class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int max_len = s1.length;

        if(max_len < s2.length)
            max_len = s2.length;

        String[] list = new String[max_len];
        int list_idx = 0;
        int count = 0; // 중복 값 갯수
        int l_count = 0; // 배열 null 개수

        // s1 반복
        for(int i = 0; i<s1.length; i++){
            //s2 반복
            for(int j = 0; j<s2.length; j++){
                // s1 원소 == s2원소
                if(s1[i].equals(s2[j])){
                    for(int k=0; k<list.length; k++){
                        // 리스트 k에 있는 값인지 검사
                        if(list[k] != null && list[k].equals(s1[i]))
                            count += 1;
                    }
                    if(count == 0){
                        list[list_idx] = s2[j];
                        list_idx +=1;
                    }
                    count = 0; // 초기화
                }
            }
        }
        
        for(int i=0; i<list.length; i++){
            if(list[i] == null){
                l_count += 1;
            }
        }
        answer = list.length-l_count;
        return answer;
    }
}