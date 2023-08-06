package Practice.Array.Array_05.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Unique_Integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m: ");
        int m=sc.nextInt();
        System.out.println("Enter the value of length: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        int count=0;
        while(i<n){
            count++;
            while(i<n-1 && arr[i+1]==arr[i]){
                i++;
            }
            i++;
        }
        if (count >=m){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
