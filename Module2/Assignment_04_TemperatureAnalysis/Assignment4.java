package Assignment_04_TemperatureAnalysis;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of days: ");
        int days = sc.nextInt();
        System.out.println("Enter the temperature: ");
        int[] temp = new int[days];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sc.nextInt();
        }
        int min=temp[0], max=temp[0], nod80=0, nod60=0, sum=0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
            if (min>temp[i]) {
                min = temp[i];
            }
            if (max<temp[i])
                max = temp[i];
            if (temp[i]>80)
                nod80++;
            if (temp[i]>60)
                nod60++;
        }
        System.out.println("The average daily temperature: "+ sum/days);
        System.out.println("The highest daily temperature: "+ max);
        System.out.println("The lowest daily temperature: "+ min);
        System.out.println("The number of days with temperatures above 80 degrees Fahrenheit: "+ nod80);
        System.out.println("The number of days with temperatures above 60 degrees Fahrenheit: "+ nod60);
    }
}
