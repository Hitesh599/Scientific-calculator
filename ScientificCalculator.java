import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator");
        System.out.println("Available operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Square root (√)");
        System.out.println("6. Sine (sin)");
        System.out.println("7. Cosine (cos)");
        System.out.println("8. Exit");

        while (true) {
            System.out.print("Enter operation number: ");
            int choice = scanner.nextInt();
            double result;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    result = Math.sqrt(num1);
                    System.out.println("Result: " + result);
                    break;
                case 6:
                    System.out.print("Enter angle in degrees: ");
                    double angle = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angle));
                    System.out.println("Result: " + result);
                    break;
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angle));
                    System.out.println("Result: " + result);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid operation number");
            }
        }
    }
}
