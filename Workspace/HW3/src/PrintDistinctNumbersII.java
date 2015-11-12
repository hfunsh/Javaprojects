import java.util.*;
 
public class PrintDistinctNumbersII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");        
        int[] values = new int[10];
        int qty = 0;
        for(int i = 0; i < 10; i++) {
            int num = input.nextInt();
            boolean distinct = true;
            for(int j = 0; j < qty; j++) {
                if (num == values[j]) {
                    distinct = false;
                    break;
                }
            }
            if (distinct) values[qty++] = num;
        }
        System.out.println("The distinct numbers are: "); 
        for(int i = 0 ; i < qty; i++) System.out.print(values[i]+" ");   
    }
}