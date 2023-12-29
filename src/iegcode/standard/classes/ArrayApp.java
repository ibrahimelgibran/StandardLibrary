package iegcode.standard.classes;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {

        int[] numbers = {
                1, 234, 2, 4, 4, 6, 2, 90, 50, 9
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,4));
        System.out.println(Arrays.binarySearch(numbers,9));
        System.out.println(Arrays.binarySearch(numbers,80));

        int[] result = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(result));

        int[] result1 = Arrays.copyOfRange(numbers, 4, 6);
        System.out.println(Arrays.toString(result1));

    }
}
