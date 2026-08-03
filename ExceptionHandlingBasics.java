class ExceptionHandlingBasics{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            int result = a / b;
            System.out.println("Result=" +result);
        }catch(ArithmeticException e){
            System.out.println("Cannot Divide a number by zero");
        }
        System.out.println("Program Run Successfully");
    }
}