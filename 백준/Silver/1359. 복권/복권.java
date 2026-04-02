import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();


        // 전체 경우의 수
        total = getCombination(N, M);

        double correct = 0;
        // K개 일치할 때부터 M개 전부 다 일치할 때까지
        for (int i = K; i <= M; i++) {
            correct += getCombination(M, i) * getCombination(N-M, M-i);
        }

        System.out.println(correct / total);
    }

    private static int getCombination(int N, int M) {
        // 조합 구하기 N C M
        int mul = 1;
        int div = 1;
        for (int i = 0; i < M; i++) {
            mul *= N - i;
            div *= M - i;
        }
        return mul / div;
    }
}
