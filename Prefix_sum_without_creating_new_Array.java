package Practice.Array.Array_05;

import java.util.Scanner;

public class Prefix_sum_without_creating_new_Array {
    static void printArray(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] makePrefixSumArray(int [] arr){
        int n=arr.length;
        int []pref=new int[n];
        pref[0]=arr[0];
        for (int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }

    static int[] makePrefixWithoutExtraArray(int []arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];

        }
        return arr;
    }



    public static void main(String[] args) {
//        a=[2, 1 , 2 , 3]
//        a=[2,3,5,8]
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Print the array");
        printArray(arr);
//        int []pref=makePrefixSumArray(arr);
//        printArray(pref);

        int []pref=makePrefixWithoutExtraArray(arr);
        printArray(pref);
    }
}
