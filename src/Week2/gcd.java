package Week2;

import java.util.Scanner;

public class gcd {

//    long gcdResultSlow(long a, long b){
//        long result = 0;
//        long greater = (a > b ) ? a : b;
//
//        for(int i = 1 ; i < greater ; ++i  ){
//
//            if ( a % i == 0  && b % i == 0)
//                result = i;
//
//        }
//        return result;
//    }

    // Eucledian algorithm

    // Key lemma
    //      let a' be the remainder when a is divided by b then  gcd(a,b) = gcd(a', b) = gcd(b' , a)

    long euclideanGcd(long a, long b){

        if(b == 0){
            return a;
        }
        return euclideanGcd(b, a%b);
    }
    
    

    public static void main(String[] args) {    
        
//        while(true){
//            long a = (long) ((Math.random() * 100000000) + 1);
//            long b = (long) ((Math.random() * 100000000) + 1);
//            System.err.println(a  + " " + b);
//            long result = new gcd().gcdResultSlow(a, b);
//            long result1 = new gcd().euclideanGcd(a, b);
//            if(result == result1){
//                System.out.println("OK");
//            }
//            else break;
//        }
//

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        long result1 = new gcd().euclideanGcd(a, b);
        System.out.println(result1);
    }
    
}
