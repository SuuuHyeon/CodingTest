import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int jiminNum = sc.nextInt();
        int hansuNum = sc.nextInt();
        int round = 0;

        while (jiminNum != hansuNum) {
            jiminNum = jiminNum / 2 + jiminNum % 2; // 다음순번
            hansuNum = hansuNum / 2 + hansuNum % 2;
            round++;
        }

        System.out.println(round);
    }

}