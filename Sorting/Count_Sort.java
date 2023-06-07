import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 0, 6, 3, 4, 0, 2, 3, 0, 6, 1, 0, 3, 4, 6, 5, 5, 1, 0, 4 };
        System.out.println("----Count Sort----");
        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int[] temp = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
            temp[i] = sum;
        }
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[temp[arr[i]] - 1] = arr[i];
            temp[arr[i]]--;
        }
        System.out.println("The sorted array is " + Arrays.toString(ans));
    }
}