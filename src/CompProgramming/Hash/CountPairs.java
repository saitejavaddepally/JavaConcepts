package CompProgramming.Hash;

import java.util.*;

public class CountPairs {
    public static int countPairs(ArrayList<Integer> A, int S) {
        /* write your solution here */
        int count = 0;

        // Declare hash table of size 100 and initialize to zero
        int[] hash = new int[100];
        Arrays.fill(hash, 0);
        for (int i = 0; i < A.size(); i++) {
            if (hash[S - A.get(i)] > 0) {
                count += hash[S - A.get(i)];
                System.out.println(hash[S-A.get(i)] + " " + count);

            }
            hash[A.get(i)] = 1;
        }

        return count / 2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        int x = countPairs(list, 2);
        System.out.println("hello" + x);
    }
}