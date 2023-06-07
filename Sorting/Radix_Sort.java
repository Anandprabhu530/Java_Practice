import java.util.Arrays;

class main {
    public static void main(String[] args) {
        int[] arr = { 1213, 323, 2, 44, 76, 7656, 334 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int exp = 1;
        while (exp <= max) {
            count_Sort(arr, exp);
            exp = exp * 10;
        }
        System.out.println("The Sorted array is " + Arrays.toString(arr));
    }

    static void count_Sort(int[] arr, int exp) {
        int[] temp = new int[10];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i] / exp % 10]++;
        }
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
            temp[i] = sum;
        }
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int pos = temp[arr[i] / exp % 10] - 1;
            ans[pos] = arr[i];
            temp[arr[i] / exp % 10]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }
}