class Solution {
        public StringBuilder solution(int[] food) {
            StringBuilder answer = new StringBuilder();
            for (int i = 1; i < food.length; i++) {
                if (food[i] != 1) {
                    int count = food[i];
                    int countPerPerson = count / 2;
                    for (int j = 0; j < countPerPerson; j++) {
                        answer.append(i);
                    }
                }
            }
            // answer = 반쪼가리
            StringBuilder reverse = new StringBuilder(answer).reverse();

            StringBuilder str = answer.append('0').append(reverse);
            System.out.println(str);

            return str;
        }
    }