import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 과목 수
        sc.nextLine();
        String[] scoreArr = sc.nextLine().split("\\s");
        double[] scores = Arrays.stream(scoreArr).mapToDouble(Integer::parseInt).toArray();
        double max = 0.0; // 최대값

        // 최대값 구하기
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > max) {
                max = scores[i];
            }
        }

        double total = 0.0;

        for(int i = 0; i < scoreArr.length; i++) {
            scores[i] = scores[i] / max * 100;
            total += scores[i];

        }


        System.out.println(total / n);
    }
}