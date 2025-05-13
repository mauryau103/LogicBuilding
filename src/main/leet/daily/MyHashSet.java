package main.leet.daily;

import java.util.HashSet;

public class MyHashSet extends HashSet<Integer> {
    public MyHashSet() {

    }

    public void add(int key) {
        super.add(key);
    }

    public void remove(int key) {
        super.remove(key);
    }

    public boolean contains(int key) {
        return super.contains(key);
    }

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(1);
        obj.remove(2);
        boolean param_3 = obj.contains(1);
    }
}
