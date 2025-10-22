import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String inputNumbers = sc.nextLine();    
        char[] inputNumberArr = inputNumbers.toCharArray();
    
        int total = 0;
    
        for(int i = 0; i < inputNumbers.length(); i++) {
            total += Character.getNumericValue(inputNumberArr[i]);
        }  
    
        System.out.println(total);
        
    }
}


