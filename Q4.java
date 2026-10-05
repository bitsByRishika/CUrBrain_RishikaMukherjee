import java.util.*;

public class Q4 {

    static int productMinusSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;

            sum += digit;
            product *= digit;

            n /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(productMinusSum(n));
        }

        sc.close();
    }
}