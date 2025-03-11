import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Finder mf = new Finder();

        System.out.println("\n\n\nWelcome to Median Finder!");
        System.out.println("\nThis app allows the user to continuously input numbers and find the median of the numbers entered.");
        System.out.println("To exit the app, type 'exit'.");
        System.out.println();
        while (true) {
            System.out.print("\nEnter a number or type 'exit': ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            try {
                int num = Integer.parseInt(input);
                mf.add(num);
                System.out.println("Current median: " + mf.findMedian());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        System.out.println("Goodbye!\n\n");
        scanner.close();
    } 
}