package lesson_2;

/*
      Дано число типа double. Окуглите это число до целого, используя все известные вам способы.
*/

public class Task_5 {
    public static void main(String[] args) {

        double a = 3.14159;

        int b = (int) a;
        int c = (int) Math.round(a);
        int i = (int) Math.floor(a);
        int d = (int) Math.ceil(a);


        System.out.println(b + "___" + c + "___" + i + "___" + d);
        System.out.format("%.2f",a);

    }
}
