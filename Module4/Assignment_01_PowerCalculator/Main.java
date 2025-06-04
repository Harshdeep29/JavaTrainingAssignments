package Assignment_01_PowerCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();

        try {
            System.out.println(calc.power(2, 3));
            System.out.println(calc.power(0, 0));
            System.out.println(calc.power(-1, 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
