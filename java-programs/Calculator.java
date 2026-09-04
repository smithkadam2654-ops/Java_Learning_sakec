import java.util.Scanner;

/**
 * A simple console-based calculator that supports basic arithmetic operations.
 * Demonstrates: OOP, user input handling, exception handling, and switch statements.
 */
public class Calculator {
    
    private double num1;
    private double num2;
    private char operator;
    
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
        this.operator = '+';
    }
    
    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    public double calculate() throws ArithmeticException {
        switch (operator) {
            case '+':
                return add();
            case '-':
                return subtract();
            case '*':
                return multiply();
            case '/':
                return divide();
            case '%':
                return modulo();
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    
    private double add() {
        return num1 + num2;
    }
    
    private double subtract() {
        return num1 - num2;
    }
    
    private double multiply() {
        return num1 * num2;
    }
    
    private double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return num1 / num2;
    }
    
    private double modulo() {
        if (num2 == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed!");
        }
        return num1 % num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        System.out.println("=== Simple Calculator ===");
        System.out.println("Supported operations: +, -, *, /, %");
        System.out.println("Type 'quit' to exit\n");
        
        while (true) {
            try {
                System.out.print("Enter first number (or 'quit'): ");
                String input1 = scanner.nextLine();
                
                if (input1.equalsIgnoreCase("quit")) {
                    System.out.println("Thank you for using Calculator. Goodbye!");
                    break;
                }
                
                double num1 = Double.parseDouble(input1);
                
                System.out.print("Enter operator (+, -, *, /, %): ");
                char operator = scanner.nextLine().charAt(0);
                
                System.out.print("Enter second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());
                
                calculator.setNumbers(num1, num2);
                calculator.setOperator(operator);
                
                double result = calculator.calculate();
                System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
                
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input! Please try again.");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
