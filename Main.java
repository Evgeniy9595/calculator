import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введи первое число: ");
        double a = sc.nextDouble();

        System.out.print("Введи оператор (+ - * /): ");
        String op = sc.next();

        System.out.print("Введи второе число: ");
        double b = sc.nextDouble();

        double result = 0;

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            result = a / b;
        }

        System.out.println("Ответ: " + result);
    }
}


