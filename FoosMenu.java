import java.util.Scanner;

class FoosMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- FOOD MENU -----");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Sandwich");
        System.out.println("4. Pasta");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Food Item: Pizza");
                System.out.println("Price: ₹250");
                break;

            case 2:
                System.out.println("Food Item: Burger");
                System.out.println("Price: ₹150");
                break;

            case 3:
                System.out.println("Food Item: Sandwich");
                System.out.println("Price: ₹120");
                break;

            case 4:
                System.out.println("Food Item: Pasta");
                System.out.println("Price: ₹180");
                break;

            case 5:
                System.out.println("Thank you! Visit Again.");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}