package lesson_2;

/*
      Найдите значение функции: ( (a - 3) * b / 2) + c.
      Значения a, b и c введите с клавиатуры.
*/

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Найдём значение функции: ( (a - 3) * b / 2) + c");

        System.out.println("Введите значение a (через запятую), а = ");
        double a = scanner.nextDouble();

        System.out.println("Введите значение b (через запятую), b = ");
        double b = scanner.nextDouble();

        System.out.println("Введите значение c (через запятую), c = ");
        double c = scanner.nextDouble();

        double D = ( (a - 3) * b / 2) + c;

        System.out.println("Ответ = " + D);

        scanner.close();

    }
}
