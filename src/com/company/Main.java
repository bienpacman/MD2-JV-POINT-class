package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Point point1 = new Point(12.4f,22.2f);
        for (float e1: point1.getXY()) {
            System.out.println(e1);
        }
        System.out.println(point1);
        MovablePoint point2 = new MovablePoint(11f,33f,44f,55f);
        for (float e2: point2.getSpeed()) {
            System.out.println( +e2);
        }
        System.out.println(point2);
    }

}
