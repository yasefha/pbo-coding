package sesi7.no3;

import java.util.ArrayList;

class Manager<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T obj) {
        data.add(obj);
    }

    public void showAll() {
        for (T obj : data) {
            System.out.println(obj);
        }
    }
}
