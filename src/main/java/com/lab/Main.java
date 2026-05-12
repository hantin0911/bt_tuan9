package com.lab;

public class Main {
    public static void main(String[] args) {
        ShippingCalculator calc = new ShippingCalculator();
        double cost = calc.calculate(10, "EXPRESS");
        System.out.println("Shipping cost for 10kg EXPRESS: " + cost);
    }
}
