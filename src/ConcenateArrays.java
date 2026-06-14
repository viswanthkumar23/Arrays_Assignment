import java.util.Arrays;
import java.util.Scanner;

public class ConcenateArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        String[] arr1 = new String[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Enter the size of the array:");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        String[] arr2 = new String[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr2));

        String[] arr3=new String[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            arr3[i+arr1.length]=arr2[i];
        }
        System.out.println("The Concenation of Two Arrays:" + Arrays.toString(arr3));
    }
}
