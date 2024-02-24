package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Twosum {

    static int[] tosum(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int c = target - arr[i];
            if (map.containsKey(c)) {
                return new int[] { map.get(c), i };
            }
            map.put(arr[i], i);
        }
        return null;
    }

    // driver class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********THE SIZE OF AN ARRAY****************");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("*************ELEMENTS IN AN ARRAY*******************");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("*****************TARGET VALUE*****************");
        int target = sc.nextInt();

        int result[] = tosum(arr, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}