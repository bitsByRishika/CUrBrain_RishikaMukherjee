import java.util.*;

public class Q2 {
    static int reverseAndDouble(int a){
        int rev=0;
        int sign= (a>0)?1:-1;
        a = Math.abs(a);
        while(a!=0){
            rev= rev*10+(a%10);
            a/=10;
        }
        return rev*sign*2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(reverseAndDouble(n));
        sc.close();
    }
}
