package com.alexesmet.example.iba;

import java.util.LinkedList;
import java.util.List;

public class ArithmeticProgression {

    private int step;
    private int begin;
    private List<Integer> list = new LinkedList<>();

    public ArithmeticProgression(int begin, int step) {
        this.step = step;
        this.begin = begin;
    }


    public int getNumber() {
        return list.size();
    }

    public int ownValue() {
        if (list.isEmpty()) {
            return begin;
        } else {
            int next = list.get(list.size() - 1) + step;
            this.list.add(next);
            return next;
        }
    }

    public int getSum() {
        return Math.round((list.get(0) + list.get(list.size() - 1)) / 2 * list.size());
    }

    public Integer getFirst() {
        return list.get(0);
    }

    public Integer getLast() {
        return list.get(list.size() - 1);
    }




    public static void main(String[] args) {
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression(0, 1);
        //System.out.println(arithmeticProgression.getSum());
        Integer in = -5;
        System.out.println(in);
    }
}
