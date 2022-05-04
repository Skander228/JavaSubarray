import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, c = 0;
        int amount = sc.nextInt();
        int[] numArray = new int[amount];
        for (int i = 0; i < amount; i++) {
            numArray[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < amount; i++) {
            System.out.println(i);
            for (int j = i; j < amount; j++) {
                sum = 0;
                for (int k=i; k <= j; k++) {
                    sum += numArray[k];
                }
                if (sum < 0) {
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}
