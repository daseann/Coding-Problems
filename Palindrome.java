import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take user input and check if the string is a
        // palindrome
        System.out.println("Enter any word or phrase: ");
        String str = sc.nextLine(); // takes in user input
        String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanedString.length();
        boolean flag = true;
        for (int i = 0; i < length / 2; i++) {
            char ch1 = Character.toLowerCase(str.charAt(i));
            char ch2 = Character.toLowerCase(str.charAt(length - i - 1));
            if (ch1 != ch2) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.print("\nThe entered string is palindrome.");
        } else {
            System.out.print("\nThe entered string is not palindrome.");
        }
        sc.close();

    }

}
