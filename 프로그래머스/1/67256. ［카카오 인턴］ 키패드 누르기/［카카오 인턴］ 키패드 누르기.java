
class Solution {
    public String solution(int[] numbers, String hand) {
        
        String answer = "";
        
        // 좌표로 넣어보기
        int[][] pad = new int[12][2];
        
        pad[1] = new int[]{0, 0};
        pad[2] = new int[]{0, 1};
        pad[3] = new int[]{0, 2};
        pad[4] = new int[]{1, 0};
        pad[5] = new int[]{1, 1};
        pad[6] = new int[]{1, 2};
        pad[7] = new int[]{2, 0};
        pad[8] = new int[]{2, 1};
        pad[9] = new int[]{2, 2};
        pad[10] = new int[]{3, 0};
        pad[0] = new int[]{3, 1};
        pad[11] = new int[]{3, 2};
        
        
        int curLeft = 10;
        int curRight  = 11;
        
        for(int num : numbers) {
            if(num == 1 || num == 4 || num == 7) {
                answer += "L";
                curLeft = num;
            } else if(num == 3 || num == 6 ||num == 9) {
                answer += "R";
                curRight = num;
            } else {
                int distanceL = Math.abs(pad[num][0] - pad[curLeft][0]) + Math.abs(pad[num][1] - pad[curLeft][1]);
                int distanceR = Math.abs(pad[num][0] - pad[curRight][0]) + Math.abs(pad[num][1] - pad[curRight][1]);
                if(distanceL == distanceR) {
                    if(hand.equals("right")) {
                        curRight = num;
                        answer += "R";
                    } else {
                        curLeft = num;
                        answer += "L";
                    }
                } else if(distanceL > distanceR) {
                    curRight = num;
                    answer += "R";
                } else {
                    curLeft = num;
                    answer += "L";
                }
            }
        }
        
        
        
        return answer;
    }
}