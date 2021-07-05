package Week1;

import java.util.Scanner;

public class PairWiseMul {

    long pairWiseSol(long[] arr){

        long result = 0;
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if (arr[i]*arr[j] > result){
                    result = arr[i]*arr[j];
                }
            }
        }

        return result;
    }


    long pairWiseSolFast(long[] arr){
        int max_index_1 = -1;
        int max_index_2 = -1;

        for (int i = 0; i < arr.length ; ++i){
            if ((max_index_1 == -1) || (arr[i] > arr[max_index_1])){
                max_index_1 = i;
            }
        }
        for (int i = 0; i < arr.length ; ++i){
            if (i!=max_index_1 && ((max_index_2 == -1) || (arr[i] > arr[max_index_2]))  ){
                max_index_2 = i;
            }
        }
        return ((arr[max_index_1]) * arr[max_index_2]);
    }

    public static void main(String[] args) {


//        while (true){
//
//            int n = (int) (Math.random() * 1000) + 2;
//            System.out.println(n);
//            long[] arr1 = new long[n];
//            for (int i = 0 ; i < n ; i++){
//                arr1[i] = (long) (Math.random()*100000);
//            }
//            System.out.println(Arrays.toString(arr1));
//            long res1 = new Week1.PairWiseMul().pairWiseSol(arr1);
//            long res2 = new Week1.PairWiseMul().pairWiseSolFast(arr1);
//
//            if (res1!=res2) {
//                System.out.println("Wrong answer" + res1 + " " + res2);
//                break;
//            }
//            else {
//                System.out.println("OK");
//            }
//
//        }


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n];

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextLong();
        }
        long result = new PairWiseMul().pairWiseSolFast(arr);
        System.out.println(result);
    }

}
