import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

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
        String[] reverse=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            reverse[arr.length-i-1]=arr[i];
        }
        System.out.println("The reversed array is:" + Arrays.toString(reverse));

    }
}
