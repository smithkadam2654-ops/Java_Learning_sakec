import java.util.Scanner;

class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (arr[i] == num) {
                System.out.println("Number found at position: " + (i + 1));
                break;
            }
        }

        sc.close();
    }
}