package Assignment_03_ReverseWords;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int length = words.length;
        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println(reversed);
    }
}
