public class Calci{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mult(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

 public static void main(String[] args) {
        Calci c = new Calci();

        System.out.println("Addition = " + c.add(20, 10));
        System.out.println("Subtraction = " + c.sub(20, 10));
        System.out.println("Multiplication = " + c.mult(20, 10));
        System.out.println("Division = " + c.div(20, 10));
    }
