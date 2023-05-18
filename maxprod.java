import java.util.Scanner;

public class maxprod {

    public static int max(int n) {
        int prod = 1;
        if (n <= 2) {
            return (n / 2) * (n - (n / 2));
        }
        while (n > 4) {
            prod = prod * 3;
            n = n - 3;
        }
        return prod * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive integer: ");
        int n = sc.nextInt();
        int value = max(n);
        System.out.println("maximum product obtained is " + n + ": " + value);
        sc.close();
    }
}
