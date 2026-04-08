import java.util.*;

class Solution {
    public static List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            // 해당 사람의 이름, 점수 넣기
            map.put(name[i], yearning[i]);
        }


        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                sum += map.getOrDefault(photo[i][j], 0);
            }
            answer.add(sum);
        }

        return answer;
    }
}