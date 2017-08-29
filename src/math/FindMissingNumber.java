package math;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println(findMissing(arr, 10));
    }
    public static int findMissing(int[] array, int n) {
        int total = 0;
        int total2 = 0;
        for (int i = 0; i < n; i++) {
            total += i;

        }
        for (int i = 0; i < array.length; i++) {
            total2 += i;
        }
        return (total - total2);
    }

}

