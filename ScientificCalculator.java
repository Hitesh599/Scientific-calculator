import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Advanced Scientific Calculator");
        while (true) {
            printMenu();
            System.out.print("Enter operation number: ");
            int choice = scanner.nextInt();
            if (!handleChoice(choice, scanner)) {
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nAvailable operations:");
        System.out.println("1. Basic Arithmetic (+, -, *, /)");
        System.out.println("2. Advanced Math (sqrt, pow, sin, cos, tan, log, exp, factorial)");
        System.out.println("3. Complex Numbers");
        System.out.println("4. Matrix Operations");
        System.out.println("5. Equation Solvers");
        System.out.println("6. Statistical Functions");
        System.out.println("7. Exit");
    }

    private static boolean handleChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                handleBasicArithmetic(scanner);
                break;
            case 2:
                handleAdvancedMath(scanner);
                break;
            case 3:
                handleComplexNumbers(scanner);
                break;
            case 4:
                handleMatrixOperations(scanner);
                break;
            case 5:
                handleEquationSolvers(scanner);
                break;
            case 6:
                handleStatisticalFunctions(scanner);
                break;
            case 7:
                System.out.println("Exiting...");
                return false;
            default:
                System.out.println("Invalid operation number");
        }
        return true;
    }

    // Placeholder for basic arithmetic
    private static void handleBasicArithmetic(Scanner scanner) {
        System.out.println("Choose operation: 1) + 2) - 3) * 4) /");
        int op = scanner.nextInt();
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double result = 0;
        switch (op) {
            case 1: result = a + b; break;
            case 2: result = a - b; break;
            case 3: result = a * b; break;
            case 4: result = (b == 0) ? Double.NaN : a / b; break;
            default: System.out.println("Invalid operation"); return;
        }
        System.out.println("Result: " + result);
    }

    // Placeholder for advanced math
    private static void handleAdvancedMath(Scanner scanner) {
        System.out.println("Choose operation: 1) sqrt 2) pow 3) sin 4) cos 5) tan 6) log 7) exp 8) factorial");
        int op = scanner.nextInt();
        double result = 0;
        switch (op) {
            case 1:
                System.out.print("Enter number: ");
                result = Math.sqrt(scanner.nextDouble());
                break;
            case 2:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exp = scanner.nextDouble();
                result = Math.pow(base, exp);
                break;
            case 3:
                System.out.print("Enter angle in degrees: ");
                result = Math.sin(Math.toRadians(scanner.nextDouble()));
                break;
            case 4:
                System.out.print("Enter angle in degrees: ");
                result = Math.cos(Math.toRadians(scanner.nextDouble()));
                break;
            case 5:
                System.out.print("Enter angle in degrees: ");
                result = Math.tan(Math.toRadians(scanner.nextDouble()));
                break;
            case 6:
                System.out.print("Enter number: ");
                result = Math.log(scanner.nextDouble());
                break;
            case 7:
                System.out.print("Enter number: ");
                result = Math.exp(scanner.nextDouble());
                break;
            case 8:
                System.out.print("Enter integer: ");
                int n = scanner.nextInt();
                result = factorial(n);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.println("Result: " + result);
    }

    private static double factorial(int n) {
        if (n < 0) return Double.NaN;
        double res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    // Placeholder for complex numbers
    private static void handleComplexNumbers(Scanner scanner) {
        System.out.println("Choose operation: 1) Add 2) Subtract 3) Multiply 4) Divide 5) Modulus");
        int op = scanner.nextInt();
        System.out.print("Enter real part of first number: ");
        double r1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first number: ");
        double i1 = scanner.nextDouble();
        System.out.print("Enter real part of second number: ");
        double r2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second number: ");
        double i2 = scanner.nextDouble();
        double real = 0, imag = 0;
        switch (op) {
            case 1: // Add
                real = r1 + r2;
                imag = i1 + i2;
                break;
            case 2: // Subtract
                real = r1 - r2;
                imag = i1 - i2;
                break;
            case 3: // Multiply
                real = r1 * r2 - i1 * i2;
                imag = r1 * i2 + i1 * r2;
                break;
            case 4: // Divide
                double denom = r2 * r2 + i2 * i2;
                if (denom == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                real = (r1 * r2 + i1 * i2) / denom;
                imag = (i1 * r2 - r1 * i2) / denom;
                break;
            case 5: // Modulus of first number
                double mod = Math.sqrt(r1 * r1 + i1 * i1);
                System.out.println("Modulus: " + mod);
                return;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.println("Result: " + real + (imag >= 0 ? "+" : "") + imag + "i");
    }

    // Placeholder for matrix operations
    private static void handleMatrixOperations(Scanner scanner) {
        System.out.println("Choose operation: 1) Add 2) Subtract 3) Multiply 4) Determinant 5) Inverse");
        int op = scanner.nextInt();
        System.out.print("Enter matrix size (n for nxn): ");
        int n = scanner.nextInt();
        double[][] A = new double[n][n];
        double[][] B = new double[n][n];
        if (op <= 3) {
            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) A[i][j] = scanner.nextDouble();
            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) B[i][j] = scanner.nextDouble();
        } else {
            System.out.println("Enter elements of matrix:");
            for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) A[i][j] = scanner.nextDouble();
        }
        double[][] result = new double[n][n];
        switch (op) {
            case 1: // Add
                for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) result[i][j] = A[i][j] + B[i][j];
                printMatrix(result);
                break;
            case 2: // Subtract
                for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) result[i][j] = A[i][j] - B[i][j];
                printMatrix(result);
                break;
            case 3: // Multiply
                for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < n; k++) result[i][j] += A[i][k] * B[k][j];
                }
                printMatrix(result);
                break;
            case 4: // Determinant
                System.out.println("Determinant: " + determinant(A));
                break;
            case 5: // Inverse
                double[][] inv = inverse(A);
                if (inv == null) System.out.println("Matrix is singular, no inverse.");
                else printMatrix(inv);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    private static void printMatrix(double[][] M) {
        System.out.println("Result:");
        for (double[] row : M) {
            for (double v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    // Recursive determinant for small matrices
    private static double determinant(double[][] M) {
        int n = M.length;
        if (n == 1) return M[0][0];
        if (n == 2) return M[0][0] * M[1][1] - M[0][1] * M[1][0];
        double det = 0;
        for (int col = 0; col < n; col++) {
            double[][] sub = new double[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int subCol = 0;
                for (int j = 0; j < n; j++) {
                    if (j == col) continue;
                    sub[i - 1][subCol++] = M[i][j];
                }
            }
            det += Math.pow(-1, col) * M[0][col] * determinant(sub);
        }
        return det;
    }

    // Inverse for 2x2 and 3x3 matrices
    private static double[][] inverse(double[][] M) {
        int n = M.length;
        double det = determinant(M);
        if (det == 0) return null;
        double[][] inv = new double[n][n];
        if (n == 2) {
            inv[0][0] = M[1][1] / det;
            inv[0][1] = -M[0][1] / det;
            inv[1][0] = -M[1][0] / det;
            inv[1][1] = M[0][0] / det;
            return inv;
        }
        // For 3x3, use adjugate
        if (n == 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    double[][] sub = new double[2][2];
                    int subi = 0;
                    for (int ii = 0; ii < 3; ii++) {
                        if (ii == i) continue;
                        int subj = 0;
                        for (int jj = 0; jj < 3; jj++) {
                            if (jj == j) continue;
                            sub[subi][subj++] = M[ii][jj];
                        }
                        subi++;
                    }
                    inv[j][i] = Math.pow(-1, i + j) * determinant(sub) / det;
                }
            }
            return inv;
        }
        return null;
    }

    // Placeholder for equation solvers
    private static void handleEquationSolvers(Scanner scanner) {
        System.out.println("Choose: 1) Linear (ax+b=0) 2) Quadratic (ax^2+bx+c=0)");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                System.out.print("Enter a: ");
                double a = scanner.nextDouble();
                System.out.print("Enter b: ");
                double b = scanner.nextDouble();
                if (a == 0) System.out.println("No solution (a=0)");
                else System.out.println("Root: " + (-b / a));
                break;
            case 2:
                System.out.print("Enter a: ");
                a = scanner.nextDouble();
                System.out.print("Enter b: ");
                b = scanner.nextDouble();
                System.out.print("Enter c: ");
                double c = scanner.nextDouble();
                double D = b * b - 4 * a * c;
                if (a == 0) System.out.println("Not a quadratic equation (a=0)");
                else if (D < 0) System.out.println("No real roots");
                else {
                    double r1 = (-b + Math.sqrt(D)) / (2 * a);
                    double r2 = (-b - Math.sqrt(D)) / (2 * a);
                    System.out.println("Roots: " + r1 + ", " + r2);
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    // Placeholder for statistical functions
    private static void handleStatisticalFunctions(Scanner scanner) {
        System.out.print("Enter number of values: ");
        int n = scanner.nextInt();
        double[] vals = new double[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) vals[i] = scanner.nextDouble();
        System.out.println("Choose: 1) Mean 2) Median 3) Std Dev");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                double sum = 0;
                for (double v : vals) sum += v;
                System.out.println("Mean: " + (sum / n));
                break;
            case 2:
                java.util.Arrays.sort(vals);
                double median = (n % 2 == 0) ? (vals[n / 2 - 1] + vals[n / 2]) / 2 : vals[n / 2];
                System.out.println("Median: " + median);
                break;
            case 3:
                sum = 0;
                for (double v : vals) sum += v;
                double mean = sum / n;
                double sq = 0;
                for (double v : vals) sq += (v - mean) * (v - mean);
                System.out.println("Std Dev: " + Math.sqrt(sq / n));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
