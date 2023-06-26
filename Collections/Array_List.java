package Java_Practice.Collections;

import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("The ArrayList Elements are: " + list);
        sc.close();
    }
}
