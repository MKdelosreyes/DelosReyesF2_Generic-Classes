package Map;

import java.util.ArrayList;

public class MyMap<K,V> {
    ArrayList<K> keys;
    ArrayList<V> values;
    public MyMap() {
        keys = new ArrayList<K>();
        values = new ArrayList<V>();
    }

    public void put(K key, V value) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            return values.get(index);
        }
        return null;
    }

    public V remove(K key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            return values.remove(index);
        }
        return null;
    }

    public void display() {
        if(keys.isEmpty()) {
            System.out.println("EMPTY");
            return;
        }

        System.out.println("Keys - Values: ");
        for(int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " -" + values.get(i));
        }
    }
}
