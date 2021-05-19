package to_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayList {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "tree"};
        ArrayList<String> stringsList = transform(strings);
        System.out.println(stringsList.getClass());
    }

    public static <T> ArrayList<T> transform(T[] array) {
        ArrayList<T> list = new ArrayList<T>();

        for(int i = 0; i < array.length; ++i)
            list.add(array[i]);

        return list;
    }

}
