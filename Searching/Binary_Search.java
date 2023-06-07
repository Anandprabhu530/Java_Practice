import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Binary Search");
        System.out.println("Enter the number of Array Elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the Array Elements in a sorted order");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find: ");
        int target = sc.nextInt();
        binary_search(arr, target);
    }

    static void binary_search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                System.out.println("Element found at: " + mid);
                return;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        System.out.println("Element Not Found");
        return;
    }
}
