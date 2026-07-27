import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();
        int passwordLength = password.length();
        boolean hasMinimumLength = passwordLength >= 8;
        boolean hasMaximumLength = passwordLength <=20;
        boolean containsSpace = password.contains(" ");
        boolean containsJava = password.contains("Java");
        boolean startsWithA = password.startsWith("A");
        boolean endsWith123 = password.endsWith("123");
        boolean isEmpty = password.isEmpty();

        System.out.println("=============== PASSWORD ANALYZER ===============");
        System.out.println("Password              : " + password);
        System.out.println("Characters            : " + passwordLength);
        System.out.println("At least 8 characters : " + hasMinimumLength);
        System.out.println("20 characters or fewer: " + hasMaximumLength);
        System.out.println("Contains spaces       : " + containsSpace);
        System.out.println("Contains \"Java\"       : " + containsJava);
        System.out.println("Starts with \"A\"       : " + startsWithA);
        System.out.println("Ends with \"123\"       : " + endsWith123);
        System.out.println("Is empty              : " + isEmpty);
        System.out.println("Uppercase             : " + password.toUpperCase());
        System.out.println("Lowercase             : " + password.toLowerCase());
        System.out.println("First character       : " + password.charAt(0));

        scanner.close();
    }
}