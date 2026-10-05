import java.util.*;

public class Q1 {
    static boolean evenDigits(int n){
        if(n==0) return false;
        int d=0;
        while(n!=0){
            d++;
            n/=10;
        }
        if(d%2==0) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(evenDigits(n)){
            System.out.print("Even number of digits");
        }else{
            System.out.print("Odd number of digits");
        }
        
        sc.close();
    }
}
