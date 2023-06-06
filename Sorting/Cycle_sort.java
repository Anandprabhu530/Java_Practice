import java.util.*;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Cyclic Sort----");
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i =0;
        while(i<arr.length-1){
            int index = arr[i] - 1;
            if(arr[i] != arr[index]){
                int temp  =arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }else{
                i++;
            }
        }
        System.out.println("The sorted Array is: " + Arrays.toString(arr));
    }
}