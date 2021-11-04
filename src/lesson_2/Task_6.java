package lesson_2;

/*
      Напишите программу, которая сравнивает два числа и выводит на экран
      сначала большее из них, а потом меньшее.
*/

import com.company.Main;

import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {

        int a = Math.abs(new Random().nextInt() % 666);
        int b = Math.abs(new Random().nextInt() % 666);

        System.out.println("Большее число = " + Math.max(a, b));
        System.out.println("Меньшее чило = " + Math.min(a, b));

    }
}
