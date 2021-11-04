package lesson_2;

/*
        Создайте переменную int со значение 127, преобразуйте ее к типу byte и выведите результат.
        Проделайте то же самое для значения 128.
*/

public class Task2 {
    public static void main(String[] args) {

        int a = 127;
        byte b = (byte) a;
        System.out.println(b);

        int a1 = 128;
        byte b1 = (byte) a1;
        System.out.println(b1);
    }
/* Диапазон байта от -128 до 127. Поскольку 128 выше диапазона,
по сути число "оборачивается" и получается 128-256=-128...
*/

}
