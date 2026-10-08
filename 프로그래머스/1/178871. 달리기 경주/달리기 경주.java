import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 이름 저장
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        
        for (String name : callings) {
            int index = map.get(name);
            String front = players[index - 1];   // 바로 앞 선수

            players[index - 1] = name;
            players[index] = front;

            map.put(name, index - 1);
            map.put(front, index);
        }

        return players;
    }
}