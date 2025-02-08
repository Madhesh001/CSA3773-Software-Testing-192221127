import java.util.Scanner;

public class program10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();

        // Calculate the square and cube
        double square = number * number;
        double cube = number * number * number;

        // Output the results
        System.out.println("Square of " + number + " is: " + square);
        System.out.println("Cube of " + number + " is: " + cube);
    }
}
