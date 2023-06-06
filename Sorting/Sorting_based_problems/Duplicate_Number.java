package Sorting_based_problems;

import java.util.*;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the missing number between 1 to n.");
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        //Based on cyclic sort
        int k=0;
        // ArrayList<Integer> list = new ArrayList<>();
        while(k<arr.length){
            int cmp = arr[k] -1;
            if(arr[k]!=k+1){
                if(arr[k]!=arr[cmp]){
                    int temp = arr[k];
                    arr[k] = arr[cmp];
                    arr[cmp] = temp;
                }else{
                    System.out.println("The duplicate number is " + arr[k]);
                    break;
                }
            }else{
                k++;
            }
        }
    }
}