import java.util.*;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Merge Sort----");
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the array Elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        splitter(arr, 0 ,arr.length-1);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }

    static void splitter(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int left = start;
        int right = end;
        int mid = left + (right-start)/2;
        while(arr[left]<arr[mid]){
            left++;
        }
        while(arr[right]>arr[mid]){
            right--;
        }
        if(left <= right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        splitter(arr,start,right);
        splitter(arr,left,end);
    }
}