import java.util.Arrays;
import java.util.Scanner;

public class SumTwoDimesionalArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Column of the array:");
        int m1 = sc.nextInt();
        System.out.println("Enter the Row of the array:");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[][] arr1 = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter the Column of the array2:");
        int m2 = sc.nextInt();
        System.out.println("Enter the Row of the array2:");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the array2:");
        int[][] arr2 = new int[m1][n1];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                arr2[i][j] = sc.nextInt();
            }

        }
            int[][] arr3 = new int[arr1.length][];

            for (int i = 0; i < arr1.length; i++) {
                arr3[i]=new int[arr1[i].length];
                for (int j = 0; j < arr1[i].length; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        System.out.println("Input1:");
        for(int i=0;i<arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println("Input2:");
        for(int i=0;i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
        System.out.println("Sum of Matrices:");
        for(int i=0;i<arr3.length;i++){
                System.out.println(Arrays.toString(arr3[i]));
            }

        sc.close();
    }
}
