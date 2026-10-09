import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 이름 → 그리움 점수 저장
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];

        // 한 장씩 확인
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            // 사진 속 한 명씩 확인
            for (String person : photo[i]) {
                if (map.containsKey(person)) {
                    sum += map.get(person);
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}