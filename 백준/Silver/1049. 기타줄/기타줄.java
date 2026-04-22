import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NM = sc.nextLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int packageCount = N % 6 != 0 ? N / 6 + 1 : N / 6;      // 패키지를 살 때 패키지 수

        int minPackage = Integer.MAX_VALUE;
        int minSingle = Integer.MAX_VALUE;
        int finalMin = 0;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            // 더 작은 수 대입
            int currentPackage = Integer.parseInt(st.nextToken());
            int currentSingle = Integer.parseInt(st.nextToken());

            minPackage = Integer.min(currentPackage, minPackage);
            minSingle = Integer.min(currentSingle, minSingle);

            int allPackage = packageCount * minPackage;
            int allSingle = N * minSingle;
            int mix  = (N / 6) * minPackage + (N % 6) * minSingle;

            int firstMin = Math.min(allPackage, allSingle);
            finalMin = Math.min(firstMin, mix);
        }

        System.out.println(finalMin);

    }
}