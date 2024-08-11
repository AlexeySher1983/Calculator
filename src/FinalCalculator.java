import java.util.Scanner;

public class FinalCalculator {


    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }

            int quantities = input.length();

            if (quantities <= 2) throw new Exception("Строка не является математической операцией!");


            String[] parts = input.split("[-*+/]");
            if (parts.length != 2) {
                throw new IllegalArgumentException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            String operation = getOperations(input);
            String part1 = parts[0];
            String part2 = parts[1];

            int a = Integer.parseInt(part1);
            int b = Integer.parseInt(part2);
            if (checkInt(a, b)) {

                switch (operation) {
                    case "+":
                        System.out.println(a + b);
                        break;
                    case "-":
                        System.out.println(a - b);
                        break;
                    case "*":
                        System.out.println(a * b);
                        break;

                    case "/":

                        System.out.println(a / b);
                        break;

                    default:
                        System.out.println("Invalid operation: " + operation);
                }

            }
        }
    }

    static String getOperations(String input) {
        if (input.contains("+")) {
            return "+";
        } else if (input.contains("-")) {
            return "-";
        } else if (input.contains("*")) {
            return "*";
        } else if (input.contains("/")) {
            return "/";
        } else {
            throw new IllegalArgumentException("Bad operation: " + input);
        }

    }

    static boolean checkInt(int a, int b) throws Exception {
        if (a > 10 || b > 10 || a < 1 || b < 1) {
            throw new Exception("некорректное значение");

        }
        return true;
    }


}