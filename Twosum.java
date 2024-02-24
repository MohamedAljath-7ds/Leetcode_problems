import java.util.Scanner;

class Twosum {

    static int[] tosum(int arr[], int target) {
        // brute force approach
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
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