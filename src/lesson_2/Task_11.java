package lesson_2;

/*
      Дано натуральное число Т, которое представляет длительность прошедшего вермени в секундах.
      Вывести данное значение длительности в часах, минутах и секундах в следующей форме: HHч Мммин SSс.
*/

import java.util.Random;

public class Task_11 {
    public static void main(String[] args) {

        int All_Time = Math.abs(new Random().nextInt() % 30000);

        int H = All_Time / 3600;
        int M = (All_Time - H * 3600) / 60;
        int S = (All_Time - H * 3600) - (M * 60);

        System.out.println("Общее время в секундах = " + All_Time);
        System.out.println( "Прошедшее время в нужном формате: \n" + H + " ч. " + M + " мин. " + S + " сек. " );

    }

}
