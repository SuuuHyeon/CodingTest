import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 카드 N장

        Queue<Integer> queue = new LinkedList<Integer>();   // 카드를 담을 큐 선언

        // 큐에 1부터 N까지의 값 삽입
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // queue의 사이즈가 1보다 클때 동안 반복
        while (queue.size() > 1) {
            queue.remove();
            Integer poll = queue.poll(); // 하나 제거 후 해당 값 반환
            queue.add(poll);
        }

        System.out.println(queue.element());

    }
}