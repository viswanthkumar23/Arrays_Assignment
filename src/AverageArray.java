import java.util.Arrays;
import java.util.Scanner;

public class AverageArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr= new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int result=sum/n;
        System.out.println("The average of the elements in the array is:" + result);
    }
}
