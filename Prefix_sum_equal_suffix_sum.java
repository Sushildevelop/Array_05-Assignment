package Practice.Array.Array_05;

import java.util.Scanner;

public class Prefix_sum_equal_suffix_sum {
    static void printArray(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int findArraySum(int [] arr){
        int totalSum=0;
        for (int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static  boolean equalSumPartition(int [] arr){
  int totalSum=findArraySum(arr);
  int prefSum=0;
  for (int i=0;i<arr.length;i++){
      prefSum+=arr[i];
      int suffixSum=totalSum - prefSum;
      if (suffixSum == prefSum){
          return true;
      }
  }
  return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Print the array");
        printArray(arr);
        System.out.println( equalSumPartition(arr));
    }
}
