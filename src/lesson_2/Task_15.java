package lesson_2;

/*
      Вычислите значение выражения по формуле (все переменные принимают действительные значения):
Значения a, b и c введите с клавиатуры.
*/

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение а = ");
        double a = scanner.nextDouble();

        System.out.println("Введите значение b = ");
        double b = scanner.nextDouble();

        System.out.println("Введите значение c = ");
        double c = scanner.nextDouble();

        // Формула довольно большая, по этому разбиваю её на части.
        // Первым делом решу "двухэтажное" выражение:
        int Kvadrat = 2;
        double X = (Math.pow(b, Kvadrat)) + 4 * a * c ;
        double Y = Math.sqrt(X);
        // Решение первой части:
        double Z = (b + Y) / (2 * a);
        // Для решения второй части заранее высчитаю отрицательную степень
        int OtricStepen = -3;
        double Y2 = Math.pow(b, OtricStepen);
        // Решение второй части:
        double Z2 = (a * 3) * c + Y2;
        // Решение всего выражения:
        double Itog = Z - Z2;

        // Для контроля правильности решения добавил вывод промежуточных результатов:
        System.out.println("Численное значение вражения под корнем = " + X);
        System.out.println("Корень квадратный из выражения = " + Y);
        System.out.println("Решение первой части = " + Z);
        System.out.println("b в отрицательной степени = " + Y2);
        System.out.println("Вторая часть выражения = " + Z2);
        System.out.println("Итоговое решение = " + Itog);

        scanner.close();

    }

}
