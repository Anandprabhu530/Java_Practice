
import java.util.*;

class Ceiling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements in peak format: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //[1,3,5,6,7,9,10] // Target = 4
        System.out.println("Enter the elements ceil to find: ");
        int target = sc.nextInt();
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]>=target && arr[mid-1]<target){
                System.out.print("The ceiling index is " + mid);
                return;
            }
            if(arr[mid]>target && arr[mid-1]>target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
    }
}