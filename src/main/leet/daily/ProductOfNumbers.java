package main.leet.daily;

import java.util.ArrayList;
import java.util.List;

public class ProductOfNumbers {
    List<Integer> list;

    public ProductOfNumbers() {
        this.list = new ArrayList<>();
        list.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            list.clear();
            list.add(1);
            return;
        }
        int n = list.size();
        list.add(list.get(n - 1) * num);
    }

    public int getProduct(int k) {
        int n = list.size();
        if (k >= n) {
            return 0;
        }
        return list.get(n - 1) / list.get(n - k - 1);
    }

    public static void main(String[] args) {
        ProductOfNumbers obj = new ProductOfNumbers();
        obj.add(3);
        obj.add(0);
        obj.add(2);
        obj.add(5);
        obj.add(4);
        int param_1 = obj.getProduct(2);
        System.out.println(param_1);
        int param_2 = obj.getProduct(3);
        System.out.println(param_2);
        int param_3 = obj.getProduct(4);
        System.out.println(param_3);
        obj.add(8);
        int param_4 = obj.getProduct(2);
        System.out.println(param_4);
    }
}
