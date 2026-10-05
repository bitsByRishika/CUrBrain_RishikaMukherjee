import java.util.*;

public class Q6 {

    static int frequencyDifference(int n, int a, int b) {
        int countA = 0;
        int countB = 0;
        if (n == 0) {
            if (a == 0) {
                countA++;
            }
            if (b == 0) {
                countB++;
            }

            return Math.abs(countA - countB);
        }

        while (n > 0) {
            int digit = n % 10;

            if (digit == a) {
                countA++;
            }

            if (digit == b) {
                countB++;
            }

            n /= 10;
        }

        return Math.abs(countA - countB);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(frequencyDifference(n, a, b));

        sc.close();
    }
}