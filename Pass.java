import java.util.Scanner;

class Pass {
    public static void main(String[] args) {
        System.out.println("Enter Marks");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 40) {
            System.out.println("Student Passed");
        }
        else{
            System.out.println("Student Failed");
        }

        sc.close();
    }
}