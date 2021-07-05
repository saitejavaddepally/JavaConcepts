package Week3;


//   GREEDY SOLUTION

// make some greedy choice
// reduce to a smaller problem
// iterate

public class CarFueling {


//  Car can travel at most L kilometers
//  There are n gas stations to travel from A to B
//  At distances x1<= x2 <= x3 ....... <=xn

    int minRefills(int[] x, int n , int L  ){

        ForLoop loop = new ForLoop();
        loop.method();

        int numRefills = 0 ;
        int curRefill =0 ;

        while (curRefill <= n){

            int lastRefill = curRefill;
            while (curRefill <= n && x[curRefill + 1] - x[lastRefill] <= L){
                curRefill++;
            }
            if ( curRefill == lastRefill) return -1;
            if (curRefill <= n) {
                numRefills++;
            }
        }
        return numRefills;
    }

}
