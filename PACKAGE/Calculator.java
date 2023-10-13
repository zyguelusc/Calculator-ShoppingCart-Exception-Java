import java.util.Scanner;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public double divide(int x, int y) {
        return x / y;
    }

    public static void main(String args[]) {
        int x;
        int y;
        int add;
        double divide;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x : ");
        x = scanner.nextInt();
        System.out.print("Enter value of y : ");
        y = scanner.nextInt();

        Calculator calculator = new Calculator();
        add = calculator.add(x, y);
        divide = calculator.divide(x, y);

        System.out.printf("X + Y is " + add + "\n");
        System.out.print("X / Y is " + divide + "\n");

        scanner.close();
    }
}
