package Sorting_based_problems;
import java.util.*;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the missing number between 0 to n.");
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        //Based on cyclic sort
        int i=0;
        while(i<arr.length-1){
            int index = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[index]){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        
        for(i=0;i<n;i++){
            if(i!=arr[i]){
                System.out.println("The mising number is " + i);
                break;
            }
        }
    }
}