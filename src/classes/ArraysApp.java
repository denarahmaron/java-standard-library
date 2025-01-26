package classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,4,5,1,2,3,5,6,7,878,56,345,315,3,23,6,7,364
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,364));
        System.out.println(Arrays.binarySearch(numbers, 1));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers,6,10);
        System.out.println(Arrays.toString(result2));

        int[] result3 = Arrays.copyOf(result, 5);

        System.out.println(Arrays.equals(result,result3));
    }
}
