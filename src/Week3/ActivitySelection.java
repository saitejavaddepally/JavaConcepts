package Week3;

// Problem statement

// Given n activities with their start and finish times. Select the maximum
// number of activities that can be performed by a single person,
// Assuming that a person can only work on a single activity at a time.



import java.util.*;

class Activity {
    int start, finish;

    public Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}

class CompareArr {

    static void compare( Activity[] arr, int n){
        Arrays.sort(arr, (activity, t1) -> activity.finish-t1.finish);
    }
}

public class ActivitySelection {
//    Greedy Approach
//    Sort the activities based on finish time
//    Select the first activity from the sorted array and print it
//    If the start time of activity is greater than or equal to the finish time
//    of previously selected activity then select this activity and print it

//    sort an array according to another array

    static void printMaxActivity(Activity[] arr, int n){
        CompareArr.compare(arr,n);
//        print the first activity

        int i = 0;
        System.out.println(arr[0].start + ", " + arr[0].finish);

        for (int j = 1 ; j < n ; j++){
            if (arr[j].start > arr[i].finish ){
                System.out.println(arr[j].start + ", " + arr[j].finish);
            }
            i = j;
        }

    }

    public static void main(String[] args) {



    }
}
