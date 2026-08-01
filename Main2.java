import java.util.Scanner;
import mypack.calculator;

public class Main2 {

    public static void main(String args[]) {

        Scanner sc =new Scanner(System.in);
        calculator c =new calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + c.add(a, b));
        System.out.println("Subtraction = " + c.sub(a, b));
        System.out.println("Multiplication = " + c.mul(a, b));
        System.out.println("Division = " + c.div(a, b));

        sc.close();
    }
}