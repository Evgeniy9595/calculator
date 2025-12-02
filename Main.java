import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();

            try {
                String result = calc(s);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("throws Exception");
                break;
            }
        }
    }

    public static String calc(String input) throws Exception {

        input = input.trim();
        String[] m = input.split(" ");

        if (m.length != 3) {
            throw new Exception();
        }

        String aStr = m[0];
        String op = m[1];
        String bStr = m[2];

        int a, b;

        try {
            a = Integer.parseInt(aStr);
            b = Integer.parseInt(bStr);
        } catch (Exception e) {
            throw new Exception();
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception();
        }

        int result;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                throw new Exception();
        }

        return String.valueOf(result);
    }
}