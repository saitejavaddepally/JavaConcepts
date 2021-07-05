
import java.util.*;

public class Main {

    static int solution(int[] array) {
        //solution here
        int n = array.length;
        int[] count = new int[n];
        Arrays.fill(count, 0);
        for(int i = 0; i < n; i++) {
            if(array[i] != -1)
                count[array[i]] += i;
        }
        int maxWeight = 0;
        int nodeNumber = 0;
        for(int i = 0; i < n; i++) {
            if(count[i] > maxWeight) {
                maxWeight = count[i];
                nodeNumber = i;
            }
        }
        return nodeNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int loop=0; loop<testCases; loop++) {
            int numOfBlocks = scanner.nextInt();
            int[] array = new int[numOfBlocks];
            for (int i=0; i<numOfBlocks; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(solution(array));
        }
        scanner.close();
    }
}
