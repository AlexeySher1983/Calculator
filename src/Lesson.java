
import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }

            int quantities = input.length();
/*
            if (quantities > 5) {
                System.out.println("Invalid operation: " + input);
                break;
            }
*/
            if (quantities <= 2) try {
                throw new Exception("Строка не является математической операцией!");
            } catch (Exception e) {
                System.out.println("Invalid operation: " + e);
            }
            //throw new Exception("Строка не является математической операцией!");

            String[] parts = input.split("[-*+/]");
            if (parts.length != 2) {
                throw new IllegalArgumentException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            String operation = getOperations(input);
            String part1 = parts[0];
            String part2 = parts[1];

            //  System.out.println(operation);
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
                       /* if (b == 0) try {
                            throw new Exception("divide by zero");
                        } catch (Exception e) {
                            System.out.println("Invalid operation: " + e);
                        }
*/

                        System.out.println(a / b);
                        break;

                    default:
                        System.out.println("Invalid operation: " + operation);
                }

            }
        }


       /*
        do {


            boolean contains = input.contains("+");

            if (contains) {
                String[] parts = input.split("\\+");
                String part1 = parts[0];
                String part2 = parts[1];
                int a = Integer.parseInt(part1);
                int b = Integer.parseInt(part2);

                if (a > 10 || b > 10) {
                    throw new Exception("некорректная операция");
                } else if (a < 1 || b < 1) {
                    System.out.println("число ниже предела");
                } else {
                    System.out.println("Output\n " + (a + b));
                }
            } else {

                boolean contains2 = input.contains("-");
                if (contains2) {
                    String[] parts = input.split("-");
                    String part1 = parts[0];
                    String part2 = parts[1];
                    int a = Integer.parseInt(part1);
                    int b = Integer.parseInt(part2);
                    if (a > 10 || b > 10) {
                        System.out.println("число выше предела");
                    } else if (a < 1 || b < 1) {
                        System.out.println("число ниже предела");
                    } else {
                        System.out.println("Output\n " + (a - b));
                    }
                } else {
                    boolean contains3 = input.contains("*");
                    if (contains3) {
                        String[] parts = input.split("\\*");
                        String part1 = parts[0];
                        String part2 = parts[1];
                        int a = Integer.parseInt(part1);
                        int b = Integer.parseInt(part2);
                        if (a > 10 || b > 10) {
                            System.out.println("число выше предела");
                        } else if (a < 1 || b < 1) {
                            System.out.println("число ниже предела");
                        } else {
                            System.out.println("Output\n " + a * b);
                        }
                    } else {
                        boolean contains4 = input.contains("/");

                        if (contains4) {
                            String[] parts = input.split("/");
                            String part1 = parts[0];
                            String part2 = parts[1];
                            int a = Integer.parseInt(part1);
                            int b = Integer.parseInt(part2);

                            if (a > 10 || b > 10) {
                                System.out.println("число выше предела");
                            } else if (a < 1 || b < 1) {
                                System.out.println("число ниже предела");
                            } else {
                                System.out.println("Output\n " + a / b);
                            }
                        } else {
                            throw new Exception("некорректная операция");

                        }
                    }
                }
            }
        }
        while (!input.equals("exit"));


    }
}

//witch (input) {
//       case


//     break;


//String[] parts =input.split("\\+");
//String part1 = parts[0];
//String part2 = parts[1];
// String[] parts2 =input.split("\\-");
//String part12 = parts[0];
// String part22 = parts[1];
//System.out.println(part1+"        +          "+part2);
//System.out.println(part12+"        -          "+part22);
/*


 };
        char first = input.charAt((0));
        char second = input.charAt((1));
        char third = input.charAt((2));
        int a = Character.getNumericValue(first);
        int c = Character.getNumericValue(third);
        int result = switch (second) {
            case '+' -> a + c;
            case '-' -> a - c;
            case '*' -> a * c;
            case '/' -> a / c;
            default  -> throw new IllegalArgumentException("Bad operation: " + second);
        };
        System.out.println(result);
//System.out.print(a); System.out.print(second); System.out.print(c);
        //System.out.println(input);
      /*  Scanner sc = new Scanner(System.in);
        while (true) {

            int a = Integer.parseInt(sc.nextLine());
            if (a > 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Введено не верное значение");
                }

            }else if(a< 1) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Введено совсем не верное значение");
                    }
                }

            }











}


             */

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

    /* static boolean checkInt(int a, int b) {
 
                 if (a > 10|| b > 10) {
                     try {
                         throw new Exception("некорректное значение");
                     } catch (Exception e) {
                         System.out.println("Значение не соответствует заданным параметрам" +e);
                     }
                 }
                     if (a < 1 || b < 1) {
                         try {
                             throw new Exception("Значение не соответствует заданным параметрам");
                         } catch (Exception e) {
                             System.out.println("Значение не соответствует заданным параметрам" +e);
                         }
                     }
 
             return true;
 
            }*/
    static boolean checkInt(int a, int b) {

        if (a > 10 || b > 10 || a < 1 || b < 1) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Значение не соответствует заданным параметрам" + e);

            }
            return false;

        }

return true;
    }
}
