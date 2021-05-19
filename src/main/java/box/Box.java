package box;

import java.util.ArrayList;
import java.util.Collections;

public class Box <T extends Fruit> {
    private ArrayList<T> content = new ArrayList<>();

    public void put(T obj) {
        content.add(obj);
    }

    public void put(Box<T> other) {
        this.content.addAll(other.content);
        other.content.clear();
    }

    public int weight() {
        if(content.isEmpty())
            return 0;

        return content.get(0).weight() * content.size();
    }

    public boolean compare(Box<?> other) {
        return this.weight() == other.weight();
    }
}
