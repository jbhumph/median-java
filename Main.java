import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Finder mf = new Finder();

        System.out.println("Welcome to Median Finder!");
        while (true) {
            System.out.print("Enter a number or type 'exit': ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            try {
                int num = Integer.parseInt(input);
                mf.addNumber(num);
                System.out.println("Current median: " + mf.getMedian());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        System.out.println("Goodbye!");
    } 
}