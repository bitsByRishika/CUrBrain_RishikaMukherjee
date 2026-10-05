import java.util.*;

public class Q5 {

    static ArrayList<Integer> replaceEvenDigits(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        int divisor = 1;
        int temp = n;
        while (temp >= 10) {
            temp /= 10;
            divisor *= 10;
        }
        while (divisor > 0) {
            int digit = n / divisor;
            n %= divisor;

            if (digit % 2 == 0) {
                result.add(0);
            } else {
                result.add(digit);
            }

            divisor /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(replaceEvenDigits(n));

        sc.close();
    }
}