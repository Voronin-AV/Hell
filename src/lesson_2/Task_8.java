package lesson_2;

/*
      Имеется N (тип int) копеек.
      Вывести на экран количество рублей и оставшихся копеек.
      Пример N = 223, вывод: 2 рубля 23 копейки.
*/

import java.util.Random;

public class Task_8 {
    public static void main(String[] args) {

        int a = Math.abs(new Random().nextInt() % 300);
        int b = a / 100;

        System.out.println("а = " + a);
        System.out.println( b + " р. " + (a % 100) + " коп.");
    }

}
