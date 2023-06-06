import java.util.*;

public class Peak_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //[1,2,1,3,5,6,4] //ans:5
        System.out.println("Enter the array elements in peak format: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = n-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        System.out.println("The peak element is " + arr[start] + " and it is located at the index: " + start);
    }
}
