
package CompProgramming.Hash;

import java.util.*;

public class Distinct {
    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        /* write your solution here */
        HashSet<Integer>  set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < A.size()-B+1 ; i++){        
          for(int j = i ; j < B+i ; j++){
              set.add(A.get(j));
          }	
            list.add(set.size());
            set.clear();
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(3);
        System.out.println(dNums(list, 3).toString());
    }
}
