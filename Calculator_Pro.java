class Addition {
    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}

class Calculator_Pro extends Addition {
    void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
    void mult(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }
    void div(int a, int b) {
        System.out.println("Division = " + (a / b));
        System.out.println("Will this be printed?");
    }
     void rem(int a, int b) {
        System.out.println("Remainder = " + (a % b));
    }
     void pow(int a, int b) {
        double c = Math.pow(a, b);
        System.out.println("Power = " + c);
    }
    void sqrt(int a) {
        double c = Math.sqrt(a);
        System.out.println("Square root = " + c);
    }



    public static void main(String[] args) {
        Calculator_Pro c = new Calculator_Pro();

        c.add(20, 10);
        c.sub(20, 10);
        c.mult(20, 10);
        c.div(20, 10);
        c.rem(21, 10);
        c.pow(2, 3);
        c.sqrt(4);
    }
}