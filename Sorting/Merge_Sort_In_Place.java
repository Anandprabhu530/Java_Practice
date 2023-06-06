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
        splitter(arr,0,arr.length-1);
        System.out.println("The sorted array is :" + Arrays.toString(arr));
    }

    static void splitter(int[] arr,int start, int end){
        if(end - start ==1){
            return;
        }
        int mid = start + (end - start)/2;
        splitter(arr,start,mid);
        splitter(arr, mid, arr.length);
        merger(arr,start,mid,end);
    }

    static void merger(int[] arr, int start,int mid,int end) {
        int[] ans = new int[end-start];
        int i=start,j=mid,k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            ans[k] = arr[i];
            k++;
            i++;
        }
        while(j<end){
            ans[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0;l<ans.length;l++){
            arr[start+l] = ans[l];
        }
    }
}