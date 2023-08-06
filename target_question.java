package Practice.Array.Array_05.Assignment;

import java.util.Scanner;

public class target_question {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] numbers=new int[n];
        System.out.println("Enter the length of array: ");
        for (int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        int i=0;
        int j=n-1;
        while (i<j){
            if (numbers[i]+numbers[j] == target){
                System.out.println(++i+" "+ ++j);
                return;
            } else if (numbers[i] + numbers[j] > target) {
                j--;

            }
            else{
                i++;
            }
        }
        System.out.println(-1);
    }
}
