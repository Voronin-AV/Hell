package lesson_2;

/*
      Предложите пользователю ввести два числа типа int и выведите на экран их сумму.
*/

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сложу для вас 2 целых числа, введите первое число: ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Сумма чисел = ");
        System.out.print(a + b);

        scanner.close();

    }

}
