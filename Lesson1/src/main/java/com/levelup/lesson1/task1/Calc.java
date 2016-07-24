package com.levelup.lesson1.task1;

/**
 * Created by Дима on 24.07.2016.
 */
public class Calc {
    private int a;
    private int b;

    public Calc() {
    }

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public long sum(){
        return a+b;
    }

    public long div(){
        return a*b;
    }

    public double mul(){
        return (double)a/(double)b;
    }


    public static void main(String[] args) {
        Calc c = new Calc(1,2);
        System.out.println("a+b="+c.sum());

    }


}
