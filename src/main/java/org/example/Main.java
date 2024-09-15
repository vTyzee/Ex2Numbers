package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Любое трёхзначное число: ");

        int number = scanner.nextInt();

        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        int sum = units + tens + hundreds;

        System.out.println("Сотни: " + hundreds);
        System.out.println("Десятки: " + tens);
        System.out.println("Единицы: " + units);
        System.out.println("Сумма: " + sum);

        scanner.close();

    }
}



