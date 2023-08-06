package Practice.Array.Array_05.Assignment;

import java.util.Scanner;

public class consective_sequences {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Array");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int odd=0,even=0,sum=0;
        for (int num:arr){
            if (num%2==1){
                int temp=odd;
                odd=even;
                even=temp;
                odd++;
            }
            else{
                even++;
            }
            sum+=odd;
        }
        System.out.println(sum);
    }
}
