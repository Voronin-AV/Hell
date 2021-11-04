package lesson_2;

/*
      Предложите пользователю ввести его имя и выведите на экран.
*/

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.print("Ваше имя: ");
        System.out.print(name.toUpperCase());

        scanner.close();
    }
}
