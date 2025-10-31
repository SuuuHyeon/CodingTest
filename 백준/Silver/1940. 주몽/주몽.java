import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String[] sNumArr = sc.nextLine().split("\\s");
        int[] iNumArr = Arrays.stream(sNumArr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(iNumArr);
        int firstIndex = 0;
        int secondIndex = N - 1;
        int count = 0;

        while(firstIndex < secondIndex) {
            if (iNumArr[firstIndex] + iNumArr[secondIndex] < M) {
                firstIndex++;
            } else if (iNumArr[firstIndex] + iNumArr[secondIndex] > M) {
                secondIndex--;
            } else {
                count++;
                firstIndex++;
                secondIndex--;
            }
        }

        System.out.println(count);
    }
}
