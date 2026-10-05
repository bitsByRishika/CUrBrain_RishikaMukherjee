import java.util.Scanner;

public class Q3 {
    static int palindromeOrSum(int n){
        int rev=0;
        int sign= (n>0)?1:-1;
        int a = Math.abs(n);
        while(a!=0){
            rev= rev*10+(a%10);
            a/=10;
        }
        rev*=sign;
        if(n==rev) return n;
        else return n+rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(palindromeOrSum(n));
        sc.close();
    }
}
