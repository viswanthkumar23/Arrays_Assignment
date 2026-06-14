import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int maximum=arr[0];
        int maximumIndex=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
                maximumIndex = i;
            }
        }
        System.out.println("The maximum number is: " +maximum);
        System.out.println("The maximum number is: " +maximumIndex);
    }
}
