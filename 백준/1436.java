import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int target = 666;

        int count = 1;
        while(count != N) {
            target++;

            if(String.valueOf(target).contains("666")) {
                count++;
            }
        }
        System.out.println(target);

    }
}
