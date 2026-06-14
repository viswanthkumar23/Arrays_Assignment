import java.util.Arrays;
import java.util.Scanner;

public class SumMultiDimensional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Column of the array:");
        int m= sc.nextInt();
        System.out.println("Enter the Row of the array:");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.print(Arrays.deepToString(arr));
        System.out.println();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }

        }
            System.out.println("The sum of the elements in the array is: " + sum);
        }
}
