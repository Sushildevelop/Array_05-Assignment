package Practice.Array.Array_05;

import java.util.Scanner;

public class Print_sum_range_of_indices {
    static void printArray(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=1;i<=n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Print the array");
        printArray(arr);
    }
}
