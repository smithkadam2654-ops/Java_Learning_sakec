import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        String reversedWithBuilder = reverseWithStringBuilder(input);
        System.out.println("Reversed with StringBuilder: " + reversedWithBuilder);

        scanner.close();
    }

    private static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    private static String reverseWithStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
