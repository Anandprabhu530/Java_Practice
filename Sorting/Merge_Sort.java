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
        System.out.println("The sorted array is :" + Arrays.toString(splitter(arr)));
    }

    static int[] splitter(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = splitter(Arrays.copyOfRange(arr,0,mid));
        int[] right = splitter(Arrays.copyOfRange(arr, mid, arr.length));
        return merger(left,right);
    }

    static int[] merger(int[] left, int[] right) {
        int[] ans = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k] = left[i];
            k++;
            i++;
        }
        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}