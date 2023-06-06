import java.util.*;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Selection Sort----");
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int last = arr.length - 1 -i;
            int maxIndex = findmaxIndex(arr,0,last);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
        System.out.println("The sorted Array is: " + Arrays.toString(arr));
    }

    static int findmaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=0;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}