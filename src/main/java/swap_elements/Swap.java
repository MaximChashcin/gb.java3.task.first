package swap_elements;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "tree"};
        System.out.println(Arrays.toString(strings));
        swap(strings, 0, 1);
        System.out.println(Arrays.toString(strings));

        Integer[] integers = {1, 2, 3};
        System.out.println(Arrays.toString(integers));
        swap(integers, 0, 1);
        System.out.println(Arrays.toString(integers));
    }

    public static <T> void swap(T[] array, int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
