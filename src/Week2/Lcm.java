package Week2;

import java.util.Scanner;

public class Lcm {

//    public long lcmSlow(long a, long b){
//
//        long result = Math.max(a, b);
//
//        while (true){
//
//            if( result%a == 0 && result%b == 0){
//                return result;
//            }
//            ++result;
//        }
//    }


    public long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }


    public long lcmFast(long a, long b){
        return ((a*b)/gcd(a,b));
    }


    public static void main(String[] args) {


//        Stress test
//        while(true){
//            long a = (long) ((Math.random() * 10000) + 1);
//            long b = (long) ((Math.random() * 10000) + 1);
//            System.err.println(a  + " " + b);
//            long result = new Lcm().lcmFast(a,b);
//            long result1 = new Lcm().lcmSlow(a, b);
//            if(result == result1){
//                System.out.println("OK");
//            }
//            else break;
//        }

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(new Lcm().lcmFast(a,b));
    }
}

