import java.util.Scanner;

class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 75) {
            System.out.println("Eligible for Scholarship");
        }

        sc.close();
    }
}