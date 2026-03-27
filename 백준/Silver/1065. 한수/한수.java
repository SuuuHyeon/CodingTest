import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        int N = sc.nextInt();



        int startNum = 1;
        while(startNum <= N) {
            String temp = Integer.toString(startNum);
            int[] arr = temp.chars().map(Character::getNumericValue).toArray();
            if (arr.length <= 2) {
                result++;
            } else {
                int minusValue = arr[1] - arr[0]; // 차잇값
                boolean isHan = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i+1] - arr[i] != minusValue) {
                        isHan = false;
                        break;
                    }
                }
                if (isHan) result++;
            }
            startNum++;
        }

        System.out.println(result);

    }
}
