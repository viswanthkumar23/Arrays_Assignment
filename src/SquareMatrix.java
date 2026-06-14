import java.util.Arrays;
import java.util.Scanner;

public class SquareMatrix {

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
        System.out.println("Input:");
        for(int i=0;i<arr.length;i++){
        System.out.println(Arrays.toString(arr[i]));
        }
        int[][] arr2=new int[arr.length][];
        for(int i=0;i<arr.length;i++ ){
            arr2[i]=new int[arr[i].length];
            for(int j=0;j<arr[i].length;j++){
                arr2[i][j]=arr[i][j]*arr[i][j];
            }
        }
        System.out.println("Output:");
        for(int i=0;i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}
