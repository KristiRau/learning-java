package com.sda;

public class Task4 {

    private double length;
    private double height;

    public Task4() {
    }

    public Task4(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double area() {
        double area = 0.5 * length * height;
        return area;
    }

    public static void main(String[] args) {
        Task4 triangle = new Task4(5,4);
        System.out.println(triangle.area());
    }





}
