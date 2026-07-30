class Addition {
    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}

class Calculator extends Addition {
    void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
    void mult(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }
    void div(int a, int b) {
        System.out.println("Division = " + (a / b));
    }
     void rem(int a, int b) {
        System.out.println("Remainder = " + (a % b));
    }



    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add(20, 10);
        c.sub(20, 10);
        c.mult(20, 10);
        c.div(20, 10);
    }
}