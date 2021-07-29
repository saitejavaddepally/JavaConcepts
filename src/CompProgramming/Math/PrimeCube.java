
package CompProgramming.Math;

public class PrimeCube {

    static boolean checkIfPrime(int num) {

        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } 
        // check for even
        else if (num % 2 == 0) {
            return false;
        }

        // we are checking for even, start with 3, 5, 7, so i+=2
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

    // prime number is divisible by 1 and itself
    // so a number to be prime count must always be 2
    // for example 5 the factors are 1 and 5, so the count is two as above mentioned

    static boolean checkIfPrime2(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    // seive of erathosthenes

    static void checkIfPrime3(int  num){
        boolean[] prime = new boolean[num+1];
        for(int i = 0 ; i <= num ; i++ ){
            prime[i] = true;
        }
        for(int p = 2 ; p <= Math.sqrt(num) ; p++){
            if(prime[p] == true){
                for(int i = p*p ; i <= num ; i+=p){
                    prime[i] = false;
                }
            }
        }

        for(int i = 2; i <= num ; i++){
            if(prime[i] == true){
                System.out.print(i + " ");
            }
        }

    }

    static long primeSum(int start, int end) {

        while (true) {
            int num = (int) (Math.random() * 1000000);
            boolean result1 = checkIfPrime(num);
            boolean result2 = checkIfPrime2(num);
            if (result1 == result2) {
                System.out.println("case worked for : " + num);
            } else {
                System.out.println("case not worked for : " + num);
                break;

            }
        }

        long result = 0;

        for (int i = start; i <= end; i++) {
            if (checkIfPrime(i)) {
                result = result + (long) Math.pow(i, 3);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(primeSum(100, 1000));
        checkIfPrime3(100);
    }
}
