import java.util.Scanner;

class MultipleCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30};

        try {
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            int result = numbers[index] / divisor;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The entered array index is invalid.");

        } catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }

        sc.close();
    }
}