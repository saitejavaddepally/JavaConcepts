package Week2;

import java.util.Comparator;

public class SortComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer integer, Integer t1) {
        System.out.println(integer + " " + t1);
        return t1.compareTo(integer);
    }
}
