package Week2;


import java.util.Scanner;

public class Fibonacci {

     public int fibonacciRecursive(int n){

        if(n <= 1){
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }


//    pisano period always starts with 0 & 1
//    so if the sequence starts with 0 & 1 again
//    pisano only works for fibonacci
//    it can be useful to find last digits of a number
//    Since we should find it in minimum 1 second, we need to have a technique to reduce the time
//    here comes the periodic way to solve this


    public int pisanoPeriod(int m){
        long fibonacci0 = 0;
        long fibonacci1 = 1;
        long total = 0;
        for ( int i = 0 ; i < m*m ; ++i){
            total = (fibonacci0 + fibonacci1) % m ;
            fibonacci0 = fibonacci1;
            fibonacci1 = total;

            if (fibonacci0 == 0 && fibonacci1 == 1)
                return i+1;
        }
        return 0;
    }

    public void fibonacciModuloLastDigit(long n, int m){
        long getPisanoPeriod = n%pisanoPeriod(m);
        long fibonacci0 = 0;
        long fibonacci1 = 1;
        long total = 0;
        for ( int i = 2 ; i <= getPisanoPeriod ; ++i){
            total = (fibonacci0 + fibonacci1) % m ;
            fibonacci0 = fibonacci1;
            fibonacci1 = total;
        }
        System.out.println(total);
    }

    public long fibonacciSumLastDigit(long n , int m){
        long fibonacci0 = 0;
        long fibonacci1 = 1;
        long total = 0;
        long totalSum = 1; // fibonacci0 + fibonacci1
        for ( int i = 2 ; i <= n ; ++i){
            total = (fibonacci0 + fibonacci1) % m ;
            fibonacci0 = fibonacci1;
            fibonacci1 = total;
            totalSum += total;
        }
        return (n>=2) ? (totalSum %m) : ((n ==1) ? fibonacci1 : fibonacci0) ;

    }

    public long fibonacci(long n  ){
        long fibonacci0 = 0;
        long fibonacci1 = 1;
        long total = 0;
        for ( int i = 2 ; i <= n ; ++i){
            total = (fibonacci0 + fibonacci1);
            fibonacci0 = fibonacci1;
            fibonacci1 = total;
        }
        return (n>=2) ? (total) : ((n ==1) ? fibonacci1 : fibonacci0) ;

    }


//    total - ( 0 to start)
    public void fibonacciSumStartToEnd( long start , long end){

        long sum = 0;
        for (long i = start ; i <= end ; i++){
//            sum += fibonacci(i, 10);
        }
        System.out.println(sum % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        long start = sc.nextLong();
        long value= sc.nextLong();
//        int modulo = sc.nextInt();
        sc.close();
        System.out.println(new Fibonacci().fibonacciSumLastDigit(value, 10));
    }
}
