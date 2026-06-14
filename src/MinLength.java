import java.util.Arrays;
import java.util.Scanner;

public class MinLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
        String minimum=arr[0];
        int minimumIndex=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i].length()<minimum.length()) {
                minimum = arr[i];
                minimumIndex = i;
            }
        }
        System.out.println(minimum);
        System.out.println(minimumIndex);


        }
    }
