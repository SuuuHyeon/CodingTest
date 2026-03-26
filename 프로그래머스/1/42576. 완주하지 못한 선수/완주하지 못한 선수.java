import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        if(participant.length == 1) return participant[0];
        Arrays.sort(participant);
        Arrays.sort(completion);

        
        for(int i = 0; i < completion.length; i++) { // 마지막이 다를 때 생각하기
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
            if (i == completion.length - 1) {
                return participant[participant.length - 1];
            }
        }

        return answer;
    }
}